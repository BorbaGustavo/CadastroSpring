package com.java10xSpring.Cadastros.Missoes;

import com.java10xSpring.Cadastros.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table (name = "tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome,dificuldade;

    @OneToMany(mappedBy = "missoes") //Uma única missão para muitos ninjas.
    private NinjaModel ninja;

}
