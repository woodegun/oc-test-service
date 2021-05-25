package com.oc.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class SimpleController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello OC! " + new Random().nextInt(100);
    }
}
