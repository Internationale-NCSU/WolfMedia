package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.Artist;
import java.util.List;

public interface ArtistMapper {
    int deleteByPrimaryKey(Integer artistId);

    int insert(Artist record);

    Artist selectByPrimaryKey(Integer artistId);

    List<Artist> selectAll();

    int updateByPrimaryKey(Artist record);
}