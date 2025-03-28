package com.example.projeto.service;

import com.example.projeto.model.Usuario;
import com.example.projeto.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listarUsuarios(){
        return usuarioRepository.findAll();
    }

    public Usuario salvar(@Valid Usuario usuario) {
        if (usuarioRepository.findByEmail(usuario.getEmail()).isPresent()) {
            throw new RuntimeException("E-mail já cadastrado");
        }

        return usuarioRepository.save(usuario);
    }

    public void excluir(String email) {
        Usuario usuario = usuarioRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Usuario não encontrado."));
        usuarioRepository.deleteById(usuario.getId());
    }

    public Usuario atualizar(@Valid Usuario usuario) {
        Usuario usuarioAtualiazar = usuarioRepository.findById(usuario.getId())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado."));

        usuarioAtualiazar.setNome(usuario.getNome());
        usuarioAtualiazar.setEmail(usuario.getEmail());
        usuarioAtualiazar.setSenha(usuario.getSenha());

        return usuarioRepository.save(usuarioAtualiazar);
    }
}
