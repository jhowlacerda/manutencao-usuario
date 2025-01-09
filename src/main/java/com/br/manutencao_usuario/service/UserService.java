package com.br.manutencao_usuario.service;

import com.br.manutencao_usuario.dto.UserRegistrationDto;
import com.br.manutencao_usuario.dto.UserUpdateDto;
import com.br.manutencao_usuario.model.User;
import com.br.manutencao_usuario.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;


    public User save(UserRegistrationDto data) {
        return repository.save(new User(data));
    }

    public List<User> listar() {
        return repository.findAll();
    }

    public User listarPorCpf(String cpf) {
        return repository.findByCpf(cpf);
    }

    public User atualizar(UserUpdateDto data) {
        var user = repository.findByCpf(data.cpf());
        return user.updateInfo(data);
    }

    public User atualizarNome(String cpf, String name) {
        var user = repository.findByCpf(cpf);
        user.setName(name);
        return repository.save(user);
    }

    public void delete(String cpf) {
        repository.deleteByCpf(cpf);
    }
}
