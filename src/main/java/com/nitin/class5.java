package com.nitin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class class5 {
    @GetMapping("/hello_nitin")
    public String sayHello() {
        return "Nitin here !";
    }
}
