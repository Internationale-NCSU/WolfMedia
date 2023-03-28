package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.performed;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerformedMapper {
    int deleteByPrimaryKey(@Param("songId") Integer songId, @Param("artistId") Integer artistId);

    int insert(performed record);

    performed selectByPrimaryKey(@Param("songId") Integer songId, @Param("artistId") Integer artistId);

    List<performed> selectAll();

    int updateByPrimaryKey(performed record);
}