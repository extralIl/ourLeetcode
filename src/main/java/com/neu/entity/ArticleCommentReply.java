package com.neu.entity;

import java.time.LocalDate;

public class ArticleCommentReply {
    private Integer id;
    private Integer creatorId;
    private Integer articleCommentId;
    private String message;
    private Integer likes;
    private Integer dislikes;
    private LocalDate editTime;
    private Integer reported;//被举报数

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

    public Integer getArticleCommentId() {
        return articleCommentId;
    }

    public void setArticleCommentId(Integer articleCommentId) {
        this.articleCommentId = articleCommentId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getDislikes() {
        return dislikes;
    }

    public void setDislikes(Integer dislikes) {
        this.dislikes = dislikes;
    }

    public LocalDate getEditTime() {
        return editTime;
    }

    public void setEditTime(LocalDate editTime) {
        this.editTime = editTime;
    }

    public Integer getReported() {
        return reported;
    }

    public void setReported(Integer reported) {
        this.reported = reported;
    }
}
