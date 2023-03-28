package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.invited;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface invitedMapper {
    int deleteByPrimaryKey(@Param("artistId") Integer artistId, @Param("podcastEpisodeId") Integer podcastEpisodeId);

    int insert(invited record);

    List<invited> selectAll();
}