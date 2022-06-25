package com.example.springboot1;

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

@Test
class UserServiceTest {

    @Mock
    private UserService userService;
    @Mock
    private UserRepository userRepository;

    @BeforeAll
    public void setup() {
        Users user = new Users();
        user.setId(1);

        when(userService.getUserById(1)).thenReturn(Optional.of(user));
       
    }
   
    @Test
    public void testUser() {
        User user = new User();
        user.setId(1);
        userService.createUser(user);
        verify(userRepository.atLeast(1));
        assertTrue(userService.getUserById.size(1));
    
    }

}