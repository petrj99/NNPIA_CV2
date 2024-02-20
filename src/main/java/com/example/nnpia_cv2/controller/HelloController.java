package com.example.nnpia_cv2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("")
    public String helloWorld(){
        return "Hello World from Spring Boot application";
    }
}
