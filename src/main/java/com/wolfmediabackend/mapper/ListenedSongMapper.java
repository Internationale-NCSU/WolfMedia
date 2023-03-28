package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.listenedSong;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ListenedSongMapper {
    int deleteByPrimaryKey(@Param("listenerId") Integer listenerId, @Param("songId") Integer songId, @Param("date") Date date);

    int insert(listenedSong record);

    List<listenedSong> selectAll();
}