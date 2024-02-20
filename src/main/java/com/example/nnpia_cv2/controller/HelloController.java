package com.example.nnpia_cv2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class HelloController {

    @GetMapping("")
    public String helloWorld(){
        return "Hello World from Spring Boot application";
    }

    @GetMapping("/{string}")
    public String helloWorldWithParameter(@PathVariable("string") String string){
        return "Received string: " + string;
    }
}
