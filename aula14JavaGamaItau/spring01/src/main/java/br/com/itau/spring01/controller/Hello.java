package br.com.itau.spring01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping
    public String hello() {
        return "Olá Mundo";
    }
}
