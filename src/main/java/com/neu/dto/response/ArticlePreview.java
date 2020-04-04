package com.neu.dto.response;

import com.neu.vo.Author;
import com.neu.vo.Reactions;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ArticlePreview {
    private Integer id;
    private String title;
    private Integer hitCount;//点击数
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
    private String thumbnail;//缩略图
    private String resourceType;//可以填写ARTICLE暂时不知道作用
    private String articleType;//可以填写UNDEFINED 暂时不知道作用
    private String topicName;//话题名,比如算法和数据结构
    private List<String> tags;//存放标签的列表
    private Author author;//用户
    private List<Reactions> reactions;//点赞数等
    private Boolean isMyFavorite;//是否被收藏

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

    public Integer getHitCount() {
        return hitCount;
    }

    public void setHitCount(Integer hitCount) {
        this.hitCount = hitCount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
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

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
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
