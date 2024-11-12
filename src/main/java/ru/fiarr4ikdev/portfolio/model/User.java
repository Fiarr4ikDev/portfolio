package ru.fiarr4ikdev.portfolio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(
        name = "_user"
)
public class User {

    @Column(
            name = "user_id"
    )
    @Id @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer id;

    @Column(
            name = "username"
    )
    private String username;

    @Column(
            name = "password"
    )
    private String password;

}
