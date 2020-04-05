package com.neu.service;

import com.neu.dto.response.ArticleDetail;
import com.neu.dto.response.ArticlePreview;
import com.neu.dto.response.OneArticle;
import com.neu.dto.response.QuestionAnswer;
import com.neu.entity.Article;
import com.neu.entity.ArticleComment;
import com.neu.entity.Draft;
import org.springframework.stereotype.Component;

import java.util.List;


public interface CircleService {


    List<ArticlePreview> getArticlePreviewList(String userId,Integer startPage,Integer endPage);

    ArticleDetail getArticleDetail(Integer articleId);

    Integer addOneArticle(Article article);

    List<ArticlePreview> getMyArticleList(Integer authorId,Integer startPage,Integer endPage);

    List<ArticleComment> getArticleCommentListByArticleIdAndPage(Integer articleId, int pageStart, int pageEnd);

    List<Draft> getDraftList(Integer authorId, int pageStart, int pageEnd);

    Draft getDraftDetail(Integer draftId);

    Integer addOneDraft(Draft draft);

    Boolean putOneDraft(Draft draft);

    Boolean deleteOneDraft(Integer draftId);

    Boolean putOneArticle(Article article);

    Boolean deleteOneArticle(Integer articleId);
}
