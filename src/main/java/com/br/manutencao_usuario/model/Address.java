package com.br.manutencao_usuario.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "adress")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue
    private UUID id;
    private String rua;
    private String numero;
    private String cidade;
    private String uf;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
