package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.PodcastHost;
import java.util.List;

public interface PodcastHostMapper {
    int deleteByPrimaryKey(Integer hostId);

    int insert(PodcastHost record);

    PodcastHost selectByPrimaryKey(Integer hostId);

    List<PodcastHost> selectAll();

    int updateByPrimaryKey(PodcastHost record);
}