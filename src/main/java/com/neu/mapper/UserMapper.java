package com.neu.mapper;

import com.neu.entity.LeetcodeUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    LeetcodeUser selectUserById(Integer creatorId);
}
