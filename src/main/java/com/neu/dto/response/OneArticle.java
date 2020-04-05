package com.neu.dto.response;

import com.neu.vo.Author;
import com.neu.vo.Reactions;

import java.time.LocalDateTime;
import java.util.List;

public class OneArticle {
    private Integer id;
    private String title;
    private String thumbnail;
    private String content;
    //3个互动
    private Integer upvote;
    private Integer confused;
    private Integer awesome;
    private Integer hitCount;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private Boolean subscribed;//用户
    private Boolean isMyFavorite;//用户
    private Author author;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUpvote() {
        return upvote;
    }

    public void setUpvote(Integer upvote) {
        this.upvote = upvote;
    }

    public Integer getConfused() {
        return confused;
    }

    public void setConfused(Integer confused) {
        this.confused = confused;
    }

    public Integer getAwesome() {
        return awesome;
    }

    public void setAwesome(Integer awesome) {
        this.awesome = awesome;
    }

    public Integer getHitCount() {
        return hitCount;
    }

    public void setHitCount(Integer hitCount) {
        this.hitCount = hitCount;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public Boolean getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    public Boolean getMyFavorite() {
        return isMyFavorite;
    }

    public void setMyFavorite(Boolean myFavorite) {
        isMyFavorite = myFavorite;
    }


    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
