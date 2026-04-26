package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class APIController {

    @GetMapping("/api")
    public String homePage() {
        return "Call as /api/{name}";
    }

    @GetMapping("/api/{name}")
    public String name(@PathVariable String name ){
        return "Hello " + name;
    }
}
