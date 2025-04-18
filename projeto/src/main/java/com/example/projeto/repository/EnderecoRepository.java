package com.example.projeto.repository;

import com.example.projeto.model.Endereco;
import com.example.projeto.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
