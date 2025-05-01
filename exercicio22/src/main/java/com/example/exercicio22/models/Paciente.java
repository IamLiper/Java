package com.example.exercicio22.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório.")
    private String nome;

    @NotBlank(message = "Telefone é obrigatório.")
    @Size(min = 8, max = 11, message = "O telefone deve ter no mínimo 8 digitos e no maxímo 11 digitos!")
    private String telefone;

    @NotBlank(message = "O e-mail é obrigatório.")
    @Email(message = "Insira um e-mail válido!")
    private String email;

    @NotBlank(message = "A senha é obrigatória.")
    @Size(min = 3, message = "A senha de ter no mínimo 3 caracteres.")
    private String senha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatório.") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Telefone é obrigatório.") String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotBlank(message = "Telefone é obrigatório.") String telefone) {
        this.telefone = telefone;
    }

    public @NotBlank(message = "O e-mail é obrigatório.") @Email(message = "Insira um e-mail válido!") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O e-mail é obrigatório.") @Email(message = "Insira um e-mail válido!") String email) {
        this.email = email;
    }

    public @NotBlank(message = "A senha é obrigatória.") @Size(min = 3, message = "A senha de ter no mínimo 3 caracteres.") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "A senha é obrigatória.") @Size(min = 3, message = "A senha de ter no mínimo 3 caracteres.") String senha) {
        this.senha = senha;
    }
}
