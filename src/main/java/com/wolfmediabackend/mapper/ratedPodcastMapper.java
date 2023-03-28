package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.ratedPodcast;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ratedPodcastMapper {
    int deleteByPrimaryKey(@Param("podcastId") Integer podcastId, @Param("listenerId") Integer listenerId);

    int insert(ratedPodcast record);

    ratedPodcast selectByPrimaryKey(@Param("podcastId") Integer podcastId, @Param("listenerId") Integer listenerId);

    List<ratedPodcast> selectAll();

    int updateByPrimaryKey(ratedPodcast record);
}