package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.PodcastEpisode;
import java.util.List;

public interface PodcastEpisodeMapper {
    int deleteByPrimaryKey(Integer podcastEpisodeId);

    int insert(PodcastEpisode record);

    PodcastEpisode selectByPrimaryKey(Integer podcastEpisodeId);

    List<PodcastEpisode> selectAll();

    int updateByPrimaryKey(PodcastEpisode record);
}