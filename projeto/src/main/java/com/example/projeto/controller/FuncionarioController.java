package com.example.projeto.controller;

import com.example.projeto.model.Funcionario;
import com.example.projeto.repository.FuncionarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    private FuncionarioRepository funcionarioRepository;

    public FuncionarioController(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @GetMapping
    public List<Funcionario> listartodos(){
        return funcionarioRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Funcionario> salvar(@RequestBody Funcionario funcionario){
        funcionarioRepository.save(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionario);
    }

    @PutMapping
    ResponseEntity<Funcionario> atualizar(@RequestBody Funcionario funcionario){
        if (funcionarioRepository.existsById(funcionario.getId())){
            funcionarioRepository.save(funcionario);
        }
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> excluir(@PathVariable Long id){
        funcionarioRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
