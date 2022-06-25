package com.example.springboot1;

import com.example.springboot1.entities.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import com.example.springboot1.Repository.UserRepository;
import com.example.springboot1.Service.UserService;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;


class UserServiceTest {

    @Mock
    private UserService userService;
    @Mock
    private UserRepository userRepository;

    @BeforeAll
    public void setup() {
        User user = new User();
        user.setId(1);

        when(userService.getUserById(1)).thenReturn(Optional.of(user));
        when(userService.getUserById(anyInt())).thenThrow(new RuntimeException("Exception"));
       
    }

    @Test
    public void testDatabaseRetrievalForUser() {
        assertInstanceOf(User.class, userService.getUserById(1).get());
        assertThrows(Exception.class, () -> userService.getUserById(2).get());
    }

    private void assertInstanceOf(Class<User> userClass, User user) {
    }

}