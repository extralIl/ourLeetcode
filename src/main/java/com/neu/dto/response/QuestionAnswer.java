package com.neu.dto.response;

import com.neu.vo.Author;
import com.neu.vo.Reactions;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class QuestionAnswer {
    private Integer id;
    private LocalDateTime createdAt;
    private String thumbnail;
    private String status;//PREPUBLISH
    private String resourceType;//ARTICLE
    private String articleType;//ANSWER
    private String content;
    private Boolean isEditorsPick;//不确定,可能是 是否修改过
    private Author author;
    private List<Reactions> reactions;
    private Boolean isMyFavorite;

    private Integer commentCount;//讨论回复数
    private String parentTitle;//讨论的问题标题

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getEditorsPick() {
        return isEditorsPick;
    }

    public void setEditorsPick(Boolean editorsPick) {
        isEditorsPick = editorsPick;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Reactions> getReactions() {
        return reactions;
    }

    public void setReactions(List<Reactions> reactions) {
        this.reactions = reactions;
    }

    public Boolean getMyFavorite() {
        return isMyFavorite;
    }

    public void setMyFavorite(Boolean myFavorite) {
        isMyFavorite = myFavorite;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public String getParentTitle() {
        return parentTitle;
    }

    public void setParentTitle(String parentTitle) {
        this.parentTitle = parentTitle;
    }

    //根据给的三种数,创建ReactionsList
    public void createReactions(Integer likes,Integer thinks,Integer surprises){

        List<Reactions> reactionsList = new ArrayList<>();

        if(likes!=null){
            Reactions reactions = new Reactions();
            reactions.setCount(likes);
            reactions.setReactionType("UPVOTE");
            reactionsList.add(reactions);
        }
        if (thinks!=null){
            Reactions reactions = new Reactions();
            reactions.setCount(thinks);
            reactions.setReactionType("CONFUSED");
            reactionsList.add(reactions);
        }
        if (surprises!=null){
            Reactions reactions = new Reactions();
            reactions.setCount(surprises);
            reactions.setReactionType("AWESOME");
            reactionsList.add(reactions);
        }

        setReactions(reactionsList);

    }
}
