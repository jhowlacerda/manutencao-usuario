package com.br.manutencao_usuario.repository;

import com.br.manutencao_usuario.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioRepository  extends JpaRepository<Usuario, UUID> {
}
