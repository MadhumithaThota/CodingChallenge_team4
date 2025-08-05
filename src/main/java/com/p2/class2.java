package com.p2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class class2 {

    @GetMapping("/hello2")
    public String hello(){
        return "Hello World from K.Kiran";
    }
}
