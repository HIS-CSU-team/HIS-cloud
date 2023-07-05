package org.example.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "DBConnection", path = "/calculator")
public interface CalculatorService {
    @GetMapping("/add")
    public double add(@RequestParam("x") double x, @RequestParam("y") double y);
}
