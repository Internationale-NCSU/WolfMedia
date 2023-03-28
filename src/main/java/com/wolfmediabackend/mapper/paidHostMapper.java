package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.paidHost;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface paidHostMapper {
    int deleteByPrimaryKey(@Param("paidHostId") Integer paidHostId, @Param("id") Integer id, @Param("paidStreamingAccountId") Integer paidStreamingAccountId);

    int insert(paidHost record);

    paidHost selectByPrimaryKey(@Param("paidHostId") Integer paidHostId, @Param("id") Integer id, @Param("paidStreamingAccountId") Integer paidStreamingAccountId);

    List<paidHost> selectAll();

    int updateByPrimaryKey(paidHost record);
}