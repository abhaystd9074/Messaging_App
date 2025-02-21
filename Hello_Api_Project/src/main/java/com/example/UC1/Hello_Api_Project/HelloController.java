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
    //uc3 Parameter using path variable
    @GetMapping("/query/{name}")
    public String display(@PathVariable String name){
        return "Hello "+ name+ " from BridgeLabz";
    }
    // uc4 getting first and last name using post request
    @PostMapping("/getfullname")
    public String sayHello(@RequestBody DtoUser user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
// uc5 getting firstname as path variable and lastname as query parameter
    @PutMapping("/hello/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz!";
    }

}

