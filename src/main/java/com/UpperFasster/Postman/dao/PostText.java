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
public class PostText {
    @Id
    @Column(
            //TODO: make auto increment
            nullable = false,
            updatable = false,
            insertable = false,
            columnDefinition = "SMALLINT UNSIGNED"
    )
    private int id;

    @Column(
            nullable = false,
            updatable = false,
            columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP"
    )
    private ZonedDateTime dateCreated;

    @Column(
            nullable = false,
            columnDefinition = "TIMESTAMP on update CURRENT_TIMESTAMP"
    )
    private ZonedDateTime dateLastChange;
    private String userText;
    private String header;
    private String postTopic;

    public int getId() {
        return id;
    }

    public ZonedDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(ZonedDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public ZonedDateTime getDateLastChange() {
        return dateLastChange;
    }

    public void setDateLastChange(ZonedDateTime dateLastChange) {
        this.dateLastChange = dateLastChange;
    }

    public String getUserText() {
        return userText;
    }

    public void setUserText(String userText) {
        this.userText = userText;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getPostTopic() {
        return postTopic;
    }

    public void setPostTopic(String postTopic) {
        this.postTopic = postTopic;
    }
}
