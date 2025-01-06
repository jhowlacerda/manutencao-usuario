package com.br.manutencao_usuario.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "endereco")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    @Id
    @GeneratedValue
    private UUID id;
    private String rua;
    private String numero;
    private String cidade;
    private String uf;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
