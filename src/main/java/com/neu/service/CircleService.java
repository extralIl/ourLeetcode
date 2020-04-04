package com.neu.service;

import com.neu.dto.response.ArticlePreview;
import org.springframework.stereotype.Component;

import java.util.List;


public interface CircleService {


    List<ArticlePreview> getArticleLists(String userId,Integer startPage,Integer endPage);

}
