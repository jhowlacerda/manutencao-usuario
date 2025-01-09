package com.br.manutencao_usuario.model;

import com.br.manutencao_usuario.dto.UserRegistrationDto;
import com.br.manutencao_usuario.dto.UserUpdateDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name="users")
@Entity
@Getter
@Setter
@NoArgsConstructor
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

    public User updateInfo(UserUpdateDto data) {
        if (data.name() != null){
            this.name = data.name();
        }
        if (data.surname()!= null){
            this.surname = data.surname();
        }
        if (data.email() != null){
            this.email = data.email();
        }
        if (data.cellPhone() != null){
            this.cellPhone = data.cellPhone();
        }
    return User.this;
    }
}
