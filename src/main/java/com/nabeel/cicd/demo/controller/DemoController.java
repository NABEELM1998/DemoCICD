package com.nabeel.cicd.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/{name}")
    public ResponseEntity<String> getWelcomeMessage(@PathVariable String name){
        String welcomeMessage = "Hi welcome to demo controller ," + name;
        return ResponseEntity.ok(welcomeMessage);

    }

}
