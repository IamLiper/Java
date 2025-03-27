package com.example.projeto.controller;

import com.example.projeto.model.Usuario;
import com.example.projeto.repository.UsuarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping
    public List<Usuario> listartodos() {
        return usuarioRepository.findAll();
    }

    @PostMapping
    ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario) {
        usuarioRepository.save(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }

    @PutMapping
    ResponseEntity<Usuario> atualizar(@RequestBody Usuario usuario) {
        if (usuarioRepository.existsById(usuario.getId())){
            usuarioRepository.save(usuario);
        }
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> excluir(@PathVariable Long id){
        usuarioRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
