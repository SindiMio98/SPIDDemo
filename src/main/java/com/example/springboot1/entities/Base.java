package com.example.springboot1.entities;
import javax.persistence.*;
import java.time.LocalDateTime;

import lombok.Data;


@Data
@MappedSuperclass
public class Base {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;//id is unique
    private String createdBy;
    private LocalDateTime createdAt = LocalDateTime.now();
  
}


