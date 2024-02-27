package com.example.nnpia_cv2.controller;

import org.springframework.web.bind.annotation.*;

// YAML - navržen tak, aby byl snadno čitelný a psatelný pro lidi,  používá odsazení pro reprezentaci hierarchie dat
// JSON - používá uzavřené složené závorky pro objekty a hranaté závorky pro pole, což umožňuje jednoduchou a přímou reprezentaci dat,
// XML - umožňuje definovat vlastní značky a atributy, což poskytuje vysokou míru přizpůsobení



// @Controller - vrací název pohledu (view name), musí se explicitně použít @ResponseBody na metodách kontroleru
// @RestController - kombinuje @Controller a @ResponseBody, 
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
