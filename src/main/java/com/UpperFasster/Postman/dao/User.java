package com.UpperFasster.Postman.dao;

import jakarta.persistence.*;


@Entity
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
    @Column(
            name = "id",
            //TODO: make auto increment
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

    public User() {}
    public User(int id, String firstName, String lastName, String email, String password) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        //TODO:Make validation of email standart
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        //TODO: password standart
        this.password = password;
    }



    @Override
    public String toString(){
        return "User{" +
                "id=" + id +
                ", firstName= '" + firstName + '\'' +
                ", lastName= '" + lastName + '\'' +
                ", email= '" + email  + '\'' +
                ", password " + password +
                '}';
    }

}
