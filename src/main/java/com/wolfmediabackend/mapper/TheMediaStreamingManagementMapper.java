package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.theMediaStreamingManagement;
import java.util.List;

public interface TheMediaStreamingManagementMapper {
    int deleteByPrimaryKey(Integer streamingAccountId);

    int insert(theMediaStreamingManagement record);

    theMediaStreamingManagement selectByPrimaryKey(Integer streamingAccountId);

    List<theMediaStreamingManagement> selectAll();

    int updateByPrimaryKey(theMediaStreamingManagement record);
}