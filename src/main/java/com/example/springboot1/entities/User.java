package com.example.springboot1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user")
public class User extends Base {
    private String name;
    private String surname;
    private String cardNo;
    private String username;
    private String password;
    private String email;
}
