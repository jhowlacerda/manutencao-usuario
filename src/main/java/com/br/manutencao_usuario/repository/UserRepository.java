package com.br.manutencao_usuario.repository;

import com.br.manutencao_usuario.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
