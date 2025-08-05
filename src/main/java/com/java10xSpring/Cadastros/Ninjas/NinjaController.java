package com.java10xSpring.Cadastros.Ninjas.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {
    @GetMapping("/bemVindo")
    public String bemVindo(){
        return "Primeiro uso de rotas";
    }
}
