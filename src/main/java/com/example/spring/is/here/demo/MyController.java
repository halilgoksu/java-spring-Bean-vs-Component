package com.example.spring.is.here.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
    @Autowired
    private FirstClass firstClass;
    @Autowired
    private  SecondClass secondClass;


    @GetMapping("/first-class")
    public String getNameOfFirt(){
        return firstClass.getName();
    }

    @GetMapping("/second-class")
    public String getNameOfSEc(){
        return secondClass.getName();
    }

}
