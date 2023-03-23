package com.UpperFasster.Postman.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(
        name = "post_text"
)
public class users_posts {
    @Id
    @Column(
            //TODO: make auto increment
            updatable = false,
            nullable = false,
            columnDefinition = "SMALLINT UNSIGNED"
    )
    private int id;
    @Column(
            nullable = false
    )
    private int user_id;
    @Column(
            nullable = false
    )
    private int post_id;

    public users_posts(int id, int user_id, int post_id) {
        this.id = id;
        this.user_id = user_id;
        this.post_id = post_id;
    }

    public int getId() {
        return id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }
}
