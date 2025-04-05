package com.example.Aula09.controller.Funcionario;

import com.example.Aula09.model.Funcionario.Funcionario;
import com.example.Aula09.service.Funcionario.FuncionarioService;
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
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("mensagem", " Funcionário " + funcionario.getNome() + " atualizado com sucesso."));
    }

    @DeleteMapping("/{matricula}")
    public ResponseEntity<Map<String, Object>> excluir(@PathVariable String matricula) {
        funcionarioService.excluir(matricula);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("mensagem", "Usuário excluido com sucesso"));
    }
}
