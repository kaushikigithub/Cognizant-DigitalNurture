package com.cognizant.spring_learn.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class HelloController {

    @GetMapping(path = "/hello")
    public String sayHello() {
        return "Hello World!!";
    }
}
