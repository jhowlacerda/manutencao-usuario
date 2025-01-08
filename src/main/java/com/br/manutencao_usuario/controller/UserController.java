package com.br.manutencao_usuario.controller;

import com.br.manutencao_usuario.dto.UserRegistrationDto;
import com.br.manutencao_usuario.dto.UserUpdateDto;
import com.br.manutencao_usuario.model.User;
import com.br.manutencao_usuario.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserRepository repository;
    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid UserRegistrationDto data){
        repository.save(new User(data));
    }

    @GetMapping
    public List<User>listar(){
      return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> listarPorId(@PathVariable UUID id){
        return repository.findById(id);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid UserUpdateDto data){
        var user = repository.getReferenceById(data.id());
        user.updateInfo(data);
    }

    @PatchMapping("/{id}/{name}")
    @Transactional
    public void atualizarNome(@PathVariable UUID id, @PathVariable String name){
        var user = repository.getReferenceById(id);
        user.setName(name);
        repository.save(user);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable UUID id){
        repository.deleteById(id);
    }
}
