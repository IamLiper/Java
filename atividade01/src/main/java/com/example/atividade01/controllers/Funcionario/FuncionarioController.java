package com.example.atividade01.controllers.Funcionario;

import com.example.atividade01.models.FuncionarioModel.Funcionario;
import com.example.atividade01.services.Funcionario.FuncionarioService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody Funcionario funcionario) {
        funcionarioService.salvar(funcionario);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", " Funcionário " + funcionario.getNome() + " cadastrado com sucesso."));
    }

    @PutMapping
    public ResponseEntity<Map<String, Object>> atualizar(@Valid @RequestBody Funcionario funcionario) {
        funcionarioService.atualizar(funcionario);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("mensagem", " Funcionário " + funcionario.getNome() + " atualizado com sucesso."));
    }

    @DeleteMapping("/{email}")
    public ResponseEntity<Map<String, Object>> excluir(@PathVariable String email) {
        funcionarioService.excluir(email);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("mensagem", "Funcionário excluido com sucesso"));
    }
}
