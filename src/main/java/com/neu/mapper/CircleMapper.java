package com.neu.mapper;

import com.neu.entity.Article;
import com.neu.entity.LeetcodeLabel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CircleMapper {


    List<Article> selectArticlesByPages(@Param("startPage") Integer startPage,@Param("endPage") Integer endPage);

    String selectTopicByArticleId(Integer id);

    List<LeetcodeLabel> selectLabelByLinkId(Integer Articleid);
}
