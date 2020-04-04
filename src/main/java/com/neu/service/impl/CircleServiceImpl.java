package com.neu.service.impl;

import com.neu.dto.response.ArticlePreview;
import com.neu.entity.Article;
import com.neu.entity.LeetcodeLabel;
import com.neu.mapper.CircleMapper;
import com.neu.service.CircleService;
import com.neu.vo.Reactions;
import javafx.scene.shape.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CircleServiceImpl implements CircleService {

    @Autowired
    CircleMapper circleMapper;

    @Override
    public List<ArticlePreview> getArticleLists(String userId, Integer startPage, Integer endPage) {

        //首先从数据库获取文章信息  (左开右闭)
        ////bug 当数据库中edit_time为0000-00-00 00:00:00时会报错
        List<Article> articles = circleMapper.selectArticlesByPages(startPage,endPage);
        //把数据绑定到dto类上ArticlePreview
        List<ArticlePreview> articlePreviews = new ArrayList<>();

        for(Article article:articles){
            //绑定文章的数据
            ArticlePreview articlePreview = new ArticlePreview();
            articlePreview.setId(article.getId());
            articlePreview.setTitle(article.getTitle());
            articlePreview.setHitCount(article.getBrowse());
            articlePreview.setCreatedAt(article.getInitializeTime());
            articlePreview.setUpdateAt(article.getEditTime());
            articlePreview.createReactions(article.getLikes(),article.getThinks(),article.getSurprises());//绑定三种互动按钮
            //绑定用户数据,等user表那边做好了再绑定(author,isMyFavorite)

            //绑定标签数据
            List<LeetcodeLabel> leetcodeLabels= circleMapper.selectLabelByLinkId(article.getId());
            List<String> tags = new ArrayList<>();
            for (LeetcodeLabel leetcodeLabel:leetcodeLabels){
                tags.add(leetcodeLabel.getLabelName());
            }
            articlePreview.setTags(tags);
            //绑定Type
            articlePreview.setResourceType("ARTICLE");
            articlePreview.setArticleType("UNDEFINED");
            //绑定话题数据
            String topicName = circleMapper.selectTopicByArticleId(article.getId());
            articlePreview.setTopicName(topicName);


            articlePreviews.add(articlePreview);
        }

        return articlePreviews;
    }














}
