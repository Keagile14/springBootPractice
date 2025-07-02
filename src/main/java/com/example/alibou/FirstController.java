package com.example.alibou;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FirstController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from my first controller";

    }

    @GetMapping("/hello2")
    public String sayHello2(){
        return "Hello2 from my first controller";

    }


}
