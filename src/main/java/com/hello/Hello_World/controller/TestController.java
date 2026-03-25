package com.hello.Hello_World.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test3")
    public String hello2(){
        return "I'm Working!!";    }


}
