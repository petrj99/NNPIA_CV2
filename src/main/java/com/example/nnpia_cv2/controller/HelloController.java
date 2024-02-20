package com.example.nnpia_cv2.controller;

import org.springframework.web.bind.annotation.*;

//@RequestMapping("/api/v1")
@RestController
public class HelloController {

    @GetMapping("")
    public String helloWorld(){
        return "Hello World from Spring Boot application";
    }

    @GetMapping("/text/{string}")
    public String helloWorldWithParameter(@PathVariable("string") String string){
        return "Received string: " + string;
    }

    @RequestMapping(value = "/{string}", method = RequestMethod.GET)
    public String helloWorldWithGet(@PathVariable("string") String string) {
        return "Received string through GET: " + string;
    }

    @GetMapping("/query")
    public String helloQueryParam(@RequestParam String message){
        return "Hello world from query with param, message: " + message;
    }
}
