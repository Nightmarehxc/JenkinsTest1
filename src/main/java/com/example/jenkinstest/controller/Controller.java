package com.example.jenkinstest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
    @RequestMapping("/")String holamundo()
    {
        return "holamundo";
    }

}
