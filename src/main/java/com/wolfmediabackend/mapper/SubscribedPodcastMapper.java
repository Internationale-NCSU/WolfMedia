package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.subscribedPodcast;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubscribedPodcastMapper {
    int deleteByPrimaryKey(@Param("podcastId") Integer podcastId, @Param("listenerId") Integer listenerId);

    int insert(subscribedPodcast record);

    subscribedPodcast selectByPrimaryKey(@Param("podcastId") Integer podcastId, @Param("listenerId") Integer listenerId);

    List<subscribedPodcast> selectAll();

    int updateByPrimaryKey(subscribedPodcast record);
}