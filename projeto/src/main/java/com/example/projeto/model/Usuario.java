package com.example.projeto.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="tab_usuario")
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    private String email;
    private String senha;
}
