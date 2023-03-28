package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.paidArtist;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaidArtistMapper {
    int deleteByPrimaryKey(@Param("id") Integer id, @Param("paidArtistId") Integer paidArtistId, @Param("paidRecordLabelId") Integer paidRecordLabelId);

    int insert(paidArtist record);

    paidArtist selectByPrimaryKey(@Param("id") Integer id, @Param("paidArtistId") Integer paidArtistId, @Param("paidRecordLabelId") Integer paidRecordLabelId);

    List<paidArtist> selectAll();

    int updateByPrimaryKey(paidArtist record);
}