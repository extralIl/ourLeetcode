package com.neu.dto.response;

import com.neu.entity.Article;
import com.neu.vo.Author;

public class ArticleDetail {
    private Article article;
    private Author author;

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
