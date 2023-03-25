package com.UpperFasster.Postman.domain.dao;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


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
    @Column(
            name = "accountCreated",
            columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP"
    )
    private LocalDateTime accountCreated;
}
