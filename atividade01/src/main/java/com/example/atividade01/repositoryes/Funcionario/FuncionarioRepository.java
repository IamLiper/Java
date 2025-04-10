package com.example.atividade01.repositoryes.Funcionario;

import com.example.atividade01.models.FuncionarioModel.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    Optional<Funcionario> findByEmail(String email);
}
