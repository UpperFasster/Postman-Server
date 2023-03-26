package com.UpperFasster.Postman.temp.domain.Post;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.ZonedDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(
        name = "post_text"
)
public class Post {
    @Id
    @GeneratedValue(
            strategy=GenerationType.AUTO
    )
    @Column(
            name = "id",
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
            nullable = true,
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
