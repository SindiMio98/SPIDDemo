package com.example.springboot1;

import com.example.springboot1.Service.SpidService;
import com.example.springboot1.Service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {SpringBoot1Application.class})
class SpringBoot1ApplicationTests {

    @Autowired
    private UserService userService;

    @Autowired
    private SpidService spidService;

    @Test
    public void test() {}

}
