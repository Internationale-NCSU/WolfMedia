package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.subscribedArtist;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubscribedArtistMapper {
    int deleteByPrimaryKey(@Param("listenerId") Integer listenerId, @Param("artistId") Integer artistId);

    int insert(subscribedArtist record);

    subscribedArtist selectByPrimaryKey(@Param("listenerId") Integer listenerId, @Param("artistId") Integer artistId);

    List<subscribedArtist> selectAll();

    int updateByPrimaryKey(subscribedArtist record);
}