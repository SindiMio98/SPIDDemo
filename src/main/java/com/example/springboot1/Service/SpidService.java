package com.example.springboot1.Service;

import com.example.springboot1.Repository.UserRepository;
import com.example.springboot1.entities.Spid;
import com.example.springboot1.entities.Status;
import com.example.springboot1.entities.User;
import com.example.springboot1.Repository.SpidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class SpidService {

    @Autowired
    private SpidRepository spidRepository;
    @Autowired
    UserRepository userRepository;

    public Spid findSpidById(long id) throws Exception {
        Optional<Spid> spid = spidRepository.findById(id);

        if (!spid.isPresent()) {
            throw new Exception("This spid does not exists");
        }

        return spid.get();
    }

    @Transactional
    public Spid createSpid(Spid spid) throws Exception {
        Optional<Spid> currentSpid = spidRepository.findSpidByUserId(spid.getUserId());
        Optional<User> user = userRepository.findById(spid.getUserId().getId());

        if (!user.isPresent()) {
            throw new Exception("This user does not exists");
        }


        if (currentSpid.isPresent()) {
            throw new Exception("This user has already created a spid");
        }

        spid.setCreatedBy(user.get().getUsername());

        return spidRepository.save(spid);
    }

    public Iterable<Spid> retriveAllSpids() {
        return spidRepository.findAll();
    }

    public Spid changeStatus(long id) throws Exception {
        Spid spid = findSpidById(id);
        spid.setStatus(Status.READY_FOR_REVIEW);
        return spidRepository.save(spid);
    }

    public void deleteSpid(long id) throws Exception {

        Optional<Spid> spid  = spidRepository.findById(id);

        // Checking if the item is alerady in db
        if (!spid.isPresent()) {
            throw new Exception("This SPID does not exists");
        }

        // Checking spid status
        if (spid.get().getStatus() != Status.PENDING) {
            throw new Exception("You are not allowed to delete this SPID");
        }

        // delete the spid
        spidRepository.delete(spid.get());
    }
}