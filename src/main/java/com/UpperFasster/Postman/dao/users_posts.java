package com.UpperFasster.Postman.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(
        name = "user_posts"
)
public class users_posts {
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
            name = "user_id",
            nullable = false
    )
    private int user_id;
    @Column(
            name = "post_id",
            nullable = false
    )
    private int post_id;
}
