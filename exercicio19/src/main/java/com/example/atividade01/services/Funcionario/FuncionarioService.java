package com.example.atividade01.services.Funcionario;

import com.example.atividade01.models.FuncionarioModel.Funcionario;
import com.example.atividade01.repositoryes.Funcionario.FuncionarioRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class FuncionarioService {
    private FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<Funcionario> listarTodos() {
        return funcionarioRepository.findAll();
    }

    public Funcionario salvar(@Valid Funcionario funcionario) {
        if (funcionarioRepository.findByEmail(funcionario.getEmail()).isPresent()) {
            throw new RuntimeException("Usuário já cadastrado.");
        }

        return funcionarioRepository.save(funcionario);
    }

    public Funcionario atualizar(@Valid Funcionario funcionario) {
        Funcionario funcionarioAtualizar = funcionarioRepository.findById(funcionario.getId())
                .orElseThrow(() -> new RuntimeException("Funcionário não encontrado."));

        funcionarioAtualizar.setNome(funcionario.getNome());
        funcionarioAtualizar.setEmail(funcionario.getEmail());
        funcionarioAtualizar.setSexo(funcionario.getSexo());
        funcionarioAtualizar.setSalario(funcionario.getSalario());
        funcionarioAtualizar.setEndereco(funcionario.getEndereco());

        return funcionarioRepository.save(funcionario);
    }

    public void excluir(String email) {
        Funcionario funcionario = funcionarioRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Funcionário não encontrado."));

        funcionarioRepository.deleteById(funcionario.getId());
    }
}
