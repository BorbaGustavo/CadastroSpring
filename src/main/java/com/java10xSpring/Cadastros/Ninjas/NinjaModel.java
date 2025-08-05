package com.java10xSpring.Cadastros;

import jakarta.persistence.*;

@Entity
@Table(name= "tb_cadasto_de_ninjas")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome,email;
    private int idade;


    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

}
