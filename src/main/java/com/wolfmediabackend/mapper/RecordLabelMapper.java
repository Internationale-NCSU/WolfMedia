package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.RecordLabel;
import java.util.List;

public interface RecordLabelMapper {
    int deleteByPrimaryKey(Integer recordLabelId);

    int insert(RecordLabel record);

    RecordLabel selectByPrimaryKey(Integer recordLabelId);

    List<RecordLabel> selectAll();

    int updateByPrimaryKey(RecordLabel record);
}