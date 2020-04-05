package com.neu.dto.request;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ArticleRequest {
    private Integer creatorId;
    private Integer topicId;
    private String thumbnail;
    private String title;
    private String message;
    private String summary;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date initializeTime;



    public ArticleRequest() {
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

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Date getInitializeTime() {
        return initializeTime;
    }

    public void setInitializeTime(Date initializeTime) {
        this.initializeTime = initializeTime;
    }
}
