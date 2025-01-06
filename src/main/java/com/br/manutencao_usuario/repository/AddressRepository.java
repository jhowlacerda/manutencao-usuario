package com.br.manutencao_usuario.repository;

import com.br.manutencao_usuario.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {
}
