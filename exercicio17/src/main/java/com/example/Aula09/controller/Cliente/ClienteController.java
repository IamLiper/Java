package com.example.Aula09.controller.Cliente;

import com.example.Aula09.model.Cliente.Cliente;
import com.example.Aula09.service.Cliente.ClienteService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Cliente> listarTodos() {
        return clienteService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody Cliente cliente) {
        clienteService.salvar(cliente);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", " Cliente " + cliente.getNome() + " cadastrado com sucesso."));
    }

    @PutMapping
    public ResponseEntity<Map<String, Object>> atualizar(@Valid @RequestBody Cliente cliente) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("mensagem", " Cliente " + cliente.getNome() + " atualizado com sucesso."));
    }

    @DeleteMapping("/{email}")
    public ResponseEntity<Map<String, Object>> excluir(@PathVariable String email) {
        clienteService.excluir(email);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("mensagem", "Cliente excluido com sucesso"));
    }
}
