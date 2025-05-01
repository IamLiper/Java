package com.example.exercicio22.service;

import com.example.exercicio22.models.Paciente;
import com.example.exercicio22.repository.PacienteRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class PacienteService {
    private PacienteRepository pacienteRepository;

    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public List<Paciente> listarTodos() {
        return pacienteRepository.findAll();
    }

    public Paciente salvar(@Valid Paciente paciente) {
        if(pacienteRepository.findByEmail(paciente.getEmail()).isPresent()) {
            throw new RuntimeException("Paciente já cadastrado!");
        }

        return pacienteRepository.save(paciente);
    }

    public Paciente atualizar(@Valid Paciente paciente) {
        Paciente pacienteAtualizar = pacienteRepository.findById(paciente.getId())
                .orElseThrow(() -> new RuntimeException("Paciente não encontrado!"));
        pacienteAtualizar.setNome(paciente.getNome());
        pacienteAtualizar.setTelefone(paciente.getTelefone());
        pacienteAtualizar.setEmail(paciente.getEmail());
        pacienteAtualizar.setSenha(paciente.getSenha());

        return pacienteRepository.save(paciente);
    }

    public void excluir(String email) {
        Paciente paciente = pacienteRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Paciente não encontrado!"));

        pacienteRepository.deleteById(paciente.getId());
    }
}
