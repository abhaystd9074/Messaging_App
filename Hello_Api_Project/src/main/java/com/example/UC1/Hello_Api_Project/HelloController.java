package com.example.UC1.Hello_Api_Project;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
   // uc1 api
    @GetMapping(value = {"/uc1", "/hello"})
    public String sayHello() {
        return "Hello, World!";
    }
    //UC2 Request parameter
    @GetMapping("/input")
    public String sayHello(@RequestParam(defaultValue = "Mark") String name) {
        return "Hello " + name + " from BridgeLabz!";
    }

}

