package com.UpperFasster.Postman.dao;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@Table(
        name = "info_users",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "user_email_unique",
                        columnNames = "email"
                )
        }
)
public class User {
    @Id
    @GeneratedValue(
            strategy=GenerationType.IDENTITY
    )
    @Column(
            name = "id",
            updatable = false,
            nullable = false,
            columnDefinition = "SMALLINT UNSIGNED"
    )
    private int id;

    @Column(
            name = "firstName",
            nullable = false
    )
    private String firstName;
    @Column(
            name = "lastName"
    )
    private String lastName;
    @Column(
            name = "email",
            unique = true,
            nullable = false
    )
    private String email;
    @Column(
            name = "password",
            nullable = false,
            length = 64
    )
    private String password;
}
