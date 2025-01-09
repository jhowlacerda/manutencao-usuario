package com.br.manutencao_usuario.controller;

import com.br.manutencao_usuario.dto.UserRegistrationDto;
import com.br.manutencao_usuario.dto.UserUpdateDto;
import com.br.manutencao_usuario.model.User;
import com.br.manutencao_usuario.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    @Transactional
    public ResponseEntity<User> save(@RequestBody @Valid UserRegistrationDto data){
        var newUser = service.save(data);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>>listar(){
       return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<User> listarPorCpf(@PathVariable String cpf){
        return ResponseEntity.ok(service.listarPorCpf(cpf));
    }

    @PutMapping
    @Transactional
    public ResponseEntity<User> atualizar(@RequestBody @Valid UserUpdateDto data){
       return ResponseEntity.ok(service.atualizar(data));
    }

    @PatchMapping("/{cpf}/{name}")
    @Transactional
    public ResponseEntity<User> atualizarNome(@PathVariable String cpf, @PathVariable String name){
        return ResponseEntity.ok(service.atualizarNome(cpf, name));
    }

    @DeleteMapping("/{cpf}")
    @Transactional
    public ResponseEntity<Void> delete(@PathVariable String cpf){
        service.delete(cpf);
        return ResponseEntity.noContent().build();
    }
}
