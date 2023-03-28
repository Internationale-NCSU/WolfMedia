package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer listenerId);

    int insert(User record);

    User selectByPrimaryKey(Integer listenerId);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}