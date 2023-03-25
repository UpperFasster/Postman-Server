package com.UpperFasster.Postman.dao;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(
        name = "user_posts"
)
public class users_posts {
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
