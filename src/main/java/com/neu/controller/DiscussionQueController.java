package com.neu.controller;

import com.neu.common.Response;
import com.neu.common.Utils;
import com.neu.dto.request.CreateDiscussionQueRequest;
import com.neu.entity.DiscussionQue;
import com.neu.service.DiscussionQueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.sql.Date;

/**
* @author lzs
* @Date 2020/4/4
*/
@RestController
@RequestMapping("/discussion")
public class DiscussionQueController {
    @Autowired
    private DiscussionQueService discussionQueService;

    @PostMapping("/create")
    public Response create(@RequestBody @Valid CreateDiscussionQueRequest request) {
        /**
         * 基于用户信息, 得到用户id
         */

        DiscussionQue discussionQue = new DiscussionQue();
        discussionQue.setCreatorId(0);
        discussionQue.setTitle(request.getTitle());
        discussionQue.setMessage(request.getMessage());
        discussionQue.setTopicId(request.getTopicId());
        discussionQue.setInitializeTime(Utils.currentTime());
        discussionQue.setEditTime(Utils.currentTime());

        int newId = discussionQueService.createDiscussionQue(discussionQue);

        return new Response(0, newId);
    }
}
