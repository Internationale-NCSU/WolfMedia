package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.Podcast;
import java.util.List;

public interface PodcastMapper {
    int deleteByPrimaryKey(Integer podcastId);

    int insert(Podcast record);

    Podcast selectByPrimaryKey(Integer podcastId);

    List<Podcast> selectAll();

    int updateByPrimaryKey(Podcast record);
}