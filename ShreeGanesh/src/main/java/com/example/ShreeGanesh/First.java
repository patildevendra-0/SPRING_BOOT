package com.example.ShreeGanesh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class First
{
    @GetMapping()
    public String FirstFunction()
    {
        return "SHREE GANESH...";
    }
}
