package com.test.restuploader.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @GetMapping("/")
    public String hello(){
        return "Hello World!";
    }

}
