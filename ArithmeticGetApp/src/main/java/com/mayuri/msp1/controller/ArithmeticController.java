package com.mayuri.msp1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
public class ArithmeticController {

    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        return "Addition of two given numbers : "+(a + b);
    }

    @GetMapping("/sub")
    public String sub(@RequestParam int a, @RequestParam int b) {
        return "Subtraction of two given numbers : "+(a - b);
    }

    @GetMapping("/mul")
    public String mul(@RequestParam int a, @RequestParam int b) {
        return "Multiplication of two given numbers : "+(a * b);
    }

    @GetMapping("/div")
    public String div(@RequestParam int a, @RequestParam int b) {
        return "Division of two given numbers : "+(double) (a / b);
    }
}
