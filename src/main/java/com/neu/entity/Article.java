package com.neu.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Article {

    private Integer id;
    private Integer creatorId;
    private Integer topicId;
    private String title;
    private String message;
    private Integer articleComments;
    private Integer likes;
    private Integer thinks;
    private Integer surprises;
    private LocalDateTime initializeTime;
    private LocalDateTime editTime;
    private Integer follows;
    private Integer browse;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getArticleComments() {
        return articleComments;
    }

    public void setArticleComments(Integer articleComments) {
        this.articleComments = articleComments;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getThinks() {
        return thinks;
    }

    public void setThinks(Integer thinks) {
        this.thinks = thinks;
    }

    public Integer getSurprises() {
        return surprises;
    }

    public void setSurprises(Integer surprises) {
        this.surprises = surprises;
    }

    public LocalDateTime getInitializeTime() {
        return initializeTime;
    }

    public void setInitializeTime(LocalDateTime initializeTime) {
        this.initializeTime = initializeTime;
    }

    public LocalDateTime getEditTime() {
        return editTime;
    }

    public void setEditTime(LocalDateTime editTime) {
        this.editTime = editTime;
    }

    public Integer getFollows() {
        return follows;
    }

    public void setFollows(Integer follows) {
        this.follows = follows;
    }

    public Integer getBrowse() {
        return browse;
    }

    public void setBrowse(Integer browse) {
        this.browse = browse;
    }
}
