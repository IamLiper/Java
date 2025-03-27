package com.example.projeto.controller;

import com.example.projeto.model.Cliente;
import com.example.projeto.repository.ClienteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping
    public List<Cliente> listartodos(){
        return clienteRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente){
        clienteRepository.save(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
    }

    @PutMapping
    ResponseEntity<Cliente> atualizar(@RequestBody Cliente cliente){
        if (clienteRepository.existsById(cliente.getId())){
            clienteRepository.save(cliente);
        }
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> excluir(@PathVariable Long id){
        clienteRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
