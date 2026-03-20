package com.hello.Hello_World.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping()
    public String hello(){
            1
        return "I'm Working!!";
    }

}
