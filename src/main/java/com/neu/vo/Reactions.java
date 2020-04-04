package com.neu.vo;

public class Reactions {
    private Integer count;
    private String reactionType;

    public Reactions(Integer count, String reactionType) {
        this.count = count;
        this.reactionType = reactionType;
    }

    public Reactions() {

    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getReactionType() {
        return reactionType;
    }

    public void setReactionType(String reactionType) {
        this.reactionType = reactionType;
    }
}
