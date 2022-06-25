package com.example.springboot1;


import com.example.springboot1.controller.MainController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class SpringBoot1Application{

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot1Application.class, args);
    }

}