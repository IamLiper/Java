package com.example.exercicio22.controller;

import com.example.exercicio22.models.Paciente;
import com.example.exercicio22.service.PacienteService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*") // Aceitar conexão de aplicações externas.
@RestController
@RequestMapping("/paciente")
public class PacienteController {
    private PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping
    public List<Paciente> listarTodos() {
        return pacienteService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody Paciente paciente) {
        pacienteService.salvar(paciente);
        return ResponseEntity
                .status(HttpStatus.CREATED)
            .body(Map.of("mensagem", "Paciente cadastrado com sucesso!"));
    }

    @PutMapping
    public ResponseEntity<Map<String, Object>> atualizar(@Valid @RequestBody Paciente paciente) {
        pacienteService.atualizar(paciente);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Paciente atualizado com sucesso!"));
    }

    @DeleteMapping("/{email}")
    public ResponseEntity<Map<String, Object>> excluir(@PathVariable String email) {
        pacienteService.excluir(email);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Paciente excluido com sucesso!"));
    }
}
