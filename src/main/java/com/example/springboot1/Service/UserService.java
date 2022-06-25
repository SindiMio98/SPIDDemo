package com.example.springboot1.Service;

import com.example.springboot1.entities.User;
import com.example.springboot1.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public Optional<User> getUserById(long id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user, long id) throws Exception {
        if (!getUserById(id).isPresent()) {
            throw new Exception("You are trying to update an user that does not exist");
        }
        user.setId(id);
        return userRepository.save(user);
    }

}