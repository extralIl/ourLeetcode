package com.neu.service;

import com.neu.entity.DiscussionQue;
import com.neu.mapper.DiscussionQueMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Calendar;

/**
* @author lzs
* @Date 2020/4/4
*/
@Service
public class DiscussionQueService {
    @Autowired
    private DiscussionQueMapper discussionQueMapper;

    public int createDiscussionQue(DiscussionQue discussionQue) {
        discussionQueMapper.createDiscussionQue(discussionQue);
        return discussionQue.getId();
    }
}
