package com.example.springboot1.Repository;

import com.example.springboot1.entities.Spid;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public class SpidRepository extends CrudRepository<Spid, Long> {
    List<Spid> findSpidById(User user);
}
