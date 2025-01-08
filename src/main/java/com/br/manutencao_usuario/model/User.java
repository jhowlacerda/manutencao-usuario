package com.br.manutencao_usuario.model;

import com.br.manutencao_usuario.dto.UserRegistrationDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name="users")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String surname;
    private String cellPhone;
    private String email;
    private String cpf;

    public User(UserRegistrationDto data) {
        this.name = data.name();
        this.surname = data.surname();
        this.email = data.email();
        this.cpf = data.cpf();
        this.cellPhone = data.cellPhone();
    }
}
