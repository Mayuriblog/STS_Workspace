package com.ms.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ArithmeticController {

    @PostMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    @PostMapping("/sub")
    public int subtract(@RequestParam int a, @RequestParam int b) {
        return a - b;
    }

    @PostMapping("/mul")
    public int multiply(@RequestParam int a, @RequestParam int b) {
        return a * b;
    }

    @PostMapping("/div")
    public int divide(@RequestParam int a, @RequestParam int b) {
        return a / b;
    }
}