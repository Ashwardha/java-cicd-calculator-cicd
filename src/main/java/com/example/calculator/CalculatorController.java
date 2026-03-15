package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/")
    public String home() {
        return "Java Calculator App is running. Use /add?a=5&b=3";
    }

    @GetMapping("/add")
    public String add(@RequestParam("a") double a, @RequestParam("b") double b) {
        return "Result: " + (a + b);
    }

    @GetMapping("/subtract")
    public String subtract(@RequestParam("a") double a, @RequestParam("b") double b) {
        return "Result: " + (a - b);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("a") double a, @RequestParam("b") double b) {
        return "Result: " + (a * b);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("a") double a, @RequestParam("b") double b) {
        if (b == 0) {
            return "Error: division by zero is not allowed";
        }
        return "Result: " + (a / b);
    }
}
