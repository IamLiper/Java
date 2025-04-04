package com.example.projeto.controller;

import com.example.projeto.model.Funcionario;
import com.example.projeto.repository.FuncionarioRepository;
import com.example.projeto.service.FuncionarioService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    private FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping
    public List<Funcionario> listarTodos() {
        return funcionarioService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<String> salvar(@Valid @RequestBody Funcionario funcionario) {
        funcionarioService.salvar(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body("Fucionario cadastrado com sucesso.");
    }

    @PutMapping
    public ResponseEntity<String> atualizar(@Valid @RequestBody Funcionario funcionario) {
        funcionarioService.atualizar(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body("Funcionario atualizado com sucesso.");
    }

    @DeleteMapping("/{email}")
    public ResponseEntity<String> excluir(@PathVariable String email) {
        funcionarioService.excluir(email);
        return ResponseEntity.noContent().build();
    }
}
