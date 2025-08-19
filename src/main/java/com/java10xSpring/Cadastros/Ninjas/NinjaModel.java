package com.java10xSpring.Cadastros.Ninjas;
import com.java10xSpring.Cadastros.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name= "tb_cadasto_de_ninjas")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome,email;
    private int idade;

   @ManyToOne//Um ninja tem uma única missão.
   @JoinColumn(name = "missoes_id") // Foreing Key
    private List<MissoesModel> missoes;


    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

}
