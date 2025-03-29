package com.example.projeto.model.Usuario;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @NotBlank(message = "E-mail é obrigatório")
    @Email(message = "Insira um email valido!")
    private String email;

    @NotBlank(message = "Senha é obrigatória")
    @Size(min = 3, message = "A senha deve ter no mínimo 3 caracteres")
    private String senha;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome é obrigatório") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatório") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "E-mail é obrigatório") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "E-mail é obrigatório") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Senha é obrigatória") @Size(min = 3, message = "A senha deve ter no mínimo 3 caracteres") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "Senha é obrigatória") @Size(min = 3, message = "A senha deve ter no mínimo 3 caracteres") String senha) {
        this.senha = senha;
    }
}
