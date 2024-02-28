package com.example.Restfulweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping
    String sayHello(){
        return "hello and welcome";
    }

    @GetMapping("/add")
    String add(){
        return "the sum is";
    }

    //http://localhost:8080/weather/bangalore
    @GetMapping(path = "/weather/{cityName}")
    String getWeather(@PathVariable String cityName){
        return  cityName +"  weather is good";
    }
}
