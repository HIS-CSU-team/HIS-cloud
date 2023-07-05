package org.example.controller;

import org.example.feign.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/caller")
public class CalController {


    CalculatorService calculatorService;
    @Autowired
    public void setCalculatorService(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }



    @GetMapping("/add")
    public double add(double x,double y)
    {
        return calculatorService.add(x,y);
    }
}
