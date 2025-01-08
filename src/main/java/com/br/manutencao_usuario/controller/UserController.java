package com.br.manutencao_usuario.controller;

import com.br.manutencao_usuario.dto.UserRegistrationDto;
import com.br.manutencao_usuario.model.User;
import com.br.manutencao_usuario.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserRepository repository;
    @PostMapping
    public void register(@RequestBody UserRegistrationDto data){
        repository.save(new User(data));
    }
}
