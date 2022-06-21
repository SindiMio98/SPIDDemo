package com.web.springboot.springbootone.Services;

import com.web.springboot.springbootone.entities.Spid;
import com.web.springboot.springbootone.entities.Status;
import com.web.springboot.springbootone.entities.User;
import org.springframework.stereotype.Service;

@Service
public class SpidService {
    public Spid createSpid(Spid spid) {
        return new Spid(
                spid.getId(),
                spid.getUser(),
                spid.getStatus(),
                spid.getDescription()
        );
    }

    public void editSpid(Spid spid, long id, User user, Status status, String description) {
        spid.setId(id);
        spid.setUser(user);
        spid.setStatus(status);
        spid.setDescription(description);
    }
}