package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.hosted;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface hostedMapper {
    int deleteByPrimaryKey(@Param("podcastEpisodeId") Integer podcastEpisodeId, @Param("hostId") Integer hostId);

    int insert(hosted record);

    List<hosted> selectAll();
}