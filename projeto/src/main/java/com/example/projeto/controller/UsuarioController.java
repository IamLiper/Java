package com.example.projeto.controller;

import com.example.projeto.model.Usuario.Usuario;
import com.example.projeto.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Usuario> listarTodos() {
        return usuarioService.listarUsuarios();
    }

    @PostMapping
    public ResponseEntity<String> salvar(@RequestBody Usuario usuario) {
        usuarioService.salvar(usuario);
        String mensagem = "Usuario " + usuario.getNome() + " cadastrado com sucesso!";
        return ResponseEntity.status(HttpStatus.CREATED).body(mensagem);
    }

    @PutMapping
    public ResponseEntity<String> atualizar(@Valid @RequestBody Usuario usuario) {
        usuarioService.atualizar(usuario);
        String mensagem = "Usuario atualizado com sucesso!";
        return ResponseEntity.ok().body(mensagem);
    }

    @DeleteMapping("/{email}")
    public ResponseEntity<String> excluir(@PathVariable String email) {
        usuarioService.excluir(email);
        return ResponseEntity.ok().body("Usuario excluido com sucesso!");
    }
}