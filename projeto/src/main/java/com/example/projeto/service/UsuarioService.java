package com.example.projeto.service;

iimport com.example.projeto.model.Funcionario.Funcionario;
import com.example.projeto.model.Funcionario.Funcionario;
import com.example.projeto.repository.FuncionarioRepository;
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

    public List<Funcionario> listarFuncionarios() {
        return funcionarioRepository.findAll();
    }

    public Funcionario salvar(@Valid Funcionario funcionario) {
        if (funcionarioRepository.findByEmail(funcionario.getEmail()).isPresent()) {
            throw new RuntimeException("E-mail já cadastrado");
        }

        return funcionarioRepository.save(funcionario);
    }

    public void excluir(String email) {
        Funcionario funcionario = funcionarioRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Funcionario não encontrado."));

        funcionarioRepository.deleteById(funcionario.getId());
    }

    public Funcionario atualizar(@Valid Funcionario funcionario) {
        Funcionario funcionarioAtualizar = funcionarioRepository.findById(funcionario.getId())
                .orElseThrow(() -> new RuntimeException("Funcionario não encontrado"));

        funcionarioAtualizar.setNome(funcionario.getNome());
        funcionarioAtualizar.setCpf(funcionario.getCpf());
        funcionarioAtualizar.setRg(funcionario.getRg());
        funcionarioAtualizar.setMatricula(funcionario.getMatricula());
        funcionarioAtualizar.setDatanascimento(funcionario.getDatanascimento());
        funcionarioAtualizar.setSexo(funcionario.getSexo());
        funcionarioAtualizar.setSetor(funcionario.getSetor());
        funcionarioAtualizar.setSalario(funcionario.getSalario());
        funcionarioAtualizar.setTelefone(funcionario.getTelefone());
        funcionarioAtualizar.setEmail(funcionario.getEmail());
        funcionarioAtualizar.setEndereco(funcionario.getEndereco());

        return funcionarioRepository.save(funcionario);
    }
}

}