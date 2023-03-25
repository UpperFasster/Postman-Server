package com.UpperFasster.Postman.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.ZonedDateTime;

@Entity
@Table(
        name = "post_text"
)
public class Post {
    @Id
    @Column(
            name = "id",
            //TODO: make auto increment
            nullable = false,
            updatable = false,
            insertable = false,
            columnDefinition = "SMALLINT UNSIGNED"
    )
    private int id;

    @Column(
            name = "dateCreated",
            nullable = false,
            updatable = false,
            insertable = false,
            columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP"
    )
    private ZonedDateTime dateCreated;

    @Column(
            name = "dateLastChange",
            updatable = false,
            insertable = false,
            nullable = false,
            columnDefinition = "TIMESTAMP on update CURRENT_TIMESTAMP"
    )
    private ZonedDateTime dateLastChange;
    @Column(
            name = "userText",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String userText;

    @Column(
            name = "header",
            nullable = false
    )
    private String header;

    @Column(
            name = "postTopic",
            nullable = false
    )
    private String postTopic;

}
