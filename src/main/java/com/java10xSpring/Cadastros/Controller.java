package com.java10xSpring.Cadastros;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
    @GetMapping("/bemVindo")
    public String bemVindo(){
        return "Primeiro uso de rotas";
    }
}
