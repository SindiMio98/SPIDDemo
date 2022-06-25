package com.example.springboot1.Repository;

import com.example.springboot1.entities.Spid;
import com.example.springboot1.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface SpidRepository extends CrudRepository<Spid, Long> {
    Optional<Spid> findSpidByUserId(User users);
}