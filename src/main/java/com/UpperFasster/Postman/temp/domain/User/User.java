package com.UpperFasster.Postman.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(
        name = "users",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "user_email_unique",
                        columnNames = "email"
                )
        }
)
public class User {
    private static final int serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(
            name = "id",
            columnDefinition = "SMALLINT UNSIGNED"
    )
    private int id;

    @Column( name = "firstName", nullable = false )
    private String firstName;

    @Column( name = "las    tName" )
    private String lastName;

    @Column( name = "email", unique = true, nullable = false )
    private String email;

    @Column( name = "password", nullable = false, length = 64 )
    private String password;

    @Column(
            name = "accountCreated",
            columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP"
    )
    private LocalDateTime accountCreated;


    @ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = {@JoinColumn(name="USER_ID", referencedColumnName = "ID")},
            inverseJoinColumns={@JoinColumn(name="ROLE_ID", referencedColumnName="ID")}
    )
    private List<Role> roles = new ArrayList<>();


    public String getName() {
        return getName();
    }

    public void setName(String s) {
        s = firstName + lastName;
    }
}

