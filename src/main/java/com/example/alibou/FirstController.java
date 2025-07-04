package com.example.alibou;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

   // @GetMapping("/hello")
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
           @RequestBody String message
    ){
        return "Request accepted message is: " + message ;
    }

    @PostMapping("/post-order")
    public  String post(
            @RequestBody Order order
    ){
        return "Request accepted & order is : " + order.toString() ;
    }

    @PostMapping("/post-order-record")
    public  String postOrder(
            @RequestBody OrderRecord order
    ){
        return "Request accepted & order is : " + order.toString() ;
    }

    //http://localhost:8080/hello/alibou
    //@GetMapping("/hello/{user-name}")
    public String pathVar(

            @PathVariable("user-name") String userName
    ){
        return "my value = "  + userName ;

    }

    //http://localhost:8080/hello?param_name=paramvalue&param_name_2=value-2
    @GetMapping("/hello")
    public String paramVar(

           @RequestParam("user-name") String userName,
           @RequestParam("user-lastname") String userLastName
    ){
        return "my value = "  + userName + " " + userLastName;

    }



}
