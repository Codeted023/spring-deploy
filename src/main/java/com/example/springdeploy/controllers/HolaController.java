package com.example.springdeploy.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {
    @GetMapping
    public  String HolaMundo(){
        return "hola mundo";
    }

    @GetMapping("/hola")
    public  String HolaGente(){
        return "hola gentee";
    }

    @GetMapping("/hola2")
    public  String HolaGente2(){
        return "hola gentee2";
    }
}
