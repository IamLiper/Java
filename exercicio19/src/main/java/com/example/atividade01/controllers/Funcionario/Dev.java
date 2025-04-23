package com.example.atividade01.controllers.Funcionario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev")
public class Dev {
    @GetMapping
    public String dev() {
        return "Blake";
    }
}
