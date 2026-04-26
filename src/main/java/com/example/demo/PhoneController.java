package com.example.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PhoneController{
    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    @PostMapping("/verify")
    public String verifyNumber(
        @RequestParam String phone
    ){
        if(phone.length() != 10){
            return "fail";
        }
        for(char c: phone.toCharArray()){
            if(c < '0' || c > '9'){
                return "Fail";
            }
        }

        return "pass";
    }
}