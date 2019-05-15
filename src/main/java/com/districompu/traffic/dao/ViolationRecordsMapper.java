package com.districompu.traffic.dao;

import com.districompu.traffic.model.ViolationRecords;
import com.districompu.traffic.model.ViolationRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViolationRecordsMapper {
    int countByExample(ViolationRecordsExample example);

    int deleteByExample(ViolationRecordsExample example);

    int deleteByPrimaryKey(String recordId);

    int insert(ViolationRecords record);

    int insertSelective(ViolationRecords record);

    List<ViolationRecords> selectByExample(ViolationRecordsExample example);

    ViolationRecords selectByPrimaryKey(String recordId);

    int updateByExampleSelective(@Param("record") ViolationRecords record, @Param("example") ViolationRecordsExample example);

    int updateByExample(@Param("record") ViolationRecords record, @Param("example") ViolationRecordsExample example);

    int updateByPrimaryKeySelective(ViolationRecords record);

    int updateByPrimaryKey(ViolationRecords record);
}