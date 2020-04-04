package com.neu.controller;

import com.neu.common.Response;
import com.neu.dto.response.ArticlePreview;
import com.neu.service.CircleService;
import com.neu.vo.Reactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/circle")
public class CircleController {

    @Autowired
    CircleService circleService;


    @RequestMapping("/hello")
    public String sayHello(){
        return "hello";
    }


    //前端传来 [开始,结束] 下标,然后服务器根据要求开始查询数据库
    //查询文章表和讨论表,先分页查询10条文章,10条讨论.然后根据 排序算法,对这20条数据进行排序.最后返回给前端
    @RequestMapping("/{userId}/getAllTopicAll")
    public Response getAllTopicAll(@RequestParam(defaultValue = "1",required = false) int page,
                                   @RequestParam(defaultValue = "20",required = false) int size,
                                   @PathVariable Integer userId){

        //首先是获取20条文章

        //获取文章列表,需要传入  当前用户id(可为null),开始页码,结束页码
        List<ArticlePreview> articlePreviews = circleService.getArticleLists(null,0,1);


        return new Response(200,articlePreviews);

    }





    /**
     * 参数:文章id
     */
    //获取文章详情,具体返回值见解包






}
