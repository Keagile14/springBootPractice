package com.example.alibou;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FirstController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from my first controller";

    }

    @GetMapping("/hello2")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String sayHello2(){
        return "Hello2 from my first controller";

    }
    @PostMapping("/post")
    public  String post(
            String message
    ){
        return "Request accepted message is: " + message ;
    }


}
