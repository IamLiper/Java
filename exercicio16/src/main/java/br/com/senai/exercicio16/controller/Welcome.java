package br.com.senai.exercicio16.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Welcome {
    @RequestMapping
    public String welcome() {
        return "Bem-vindo ao exercicio16!";
    }
}
