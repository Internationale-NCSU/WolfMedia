package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.paidService;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaidServiceMapper {
    int deleteByPrimaryKey(@Param("id") Integer id, @Param("paidUserId") Integer paidUserId, @Param("paidStreamingAccountId") Integer paidStreamingAccountId);

    int insert(paidService record);

    paidService selectByPrimaryKey(@Param("id") Integer id, @Param("paidUserId") Integer paidUserId, @Param("paidStreamingAccountId") Integer paidStreamingAccountId);

    List<paidService> selectAll();

    int updateByPrimaryKey(paidService record);
}