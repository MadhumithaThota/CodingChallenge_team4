package com.rakshanda;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class class3 {
     @GetMapping("/helloR")
    public String sayHello() {
        return "Hello Rakshanda this side";
    }
}
