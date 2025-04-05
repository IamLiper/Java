package com.example.Aula09.service.Cliente;

import com.example.Aula09.model.Cliente.Cliente;
import com.example.Aula09.repository.Cliente.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    public Cliente salvar(@Valid Cliente cliente) {
        if (clienteRepository.findByEmail(cliente.getEmail()).isPresent()) {
            throw new RuntimeException("Cliente já cadastrado.");
        }

        return clienteRepository.save(cliente);
    }

    public Cliente atualizar(@Valid Cliente cliente) {
        Cliente clienteAtualizar = clienteRepository.findById(cliente.getId())
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado."));

        clienteAtualizar.setNome(cliente.getNome());
        clienteAtualizar.setEmail(cliente.getEmail());
        clienteAtualizar.setTelefone(cliente.getTelefone());
        clienteAtualizar.setEndereco(cliente.getEndereco());

        return clienteRepository.save(cliente);
    }

    public void excluir(String email) {
        Cliente cliente = clienteRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado."));

        clienteRepository.deleteById(cliente.getId());
    }
}
