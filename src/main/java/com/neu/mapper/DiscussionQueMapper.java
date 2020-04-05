package com.neu.mapper;

import com.neu.entity.DiscussionQue;
import org.springframework.stereotype.Repository;
/**
* @author lzs
* @Date 2020/4/4
*/

@Repository
public interface DiscussionQueMapper {
    /**
     * 创建讨论
     */
    void createDiscussionQue(DiscussionQue discussionQue);
}
