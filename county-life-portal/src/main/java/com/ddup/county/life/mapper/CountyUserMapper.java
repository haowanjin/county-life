package com.ddup.county.life.mapper;

import com.ddup.county.life.entity.CountyUser;
import com.ddup.county.life.entity.CountyUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CountyUserMapper {
    long countByExample(CountyUserExample example);

    int deleteByExample(CountyUserExample example);

    int deleteByPrimaryKey(String code);

    int insert(CountyUser record);

    int insertSelective(CountyUser record);

    List<CountyUser> selectByExample(CountyUserExample example);

    CountyUser selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") CountyUser record, @Param("example") CountyUserExample example);

    int updateByExample(@Param("record") CountyUser record, @Param("example") CountyUserExample example);

    int updateByPrimaryKeySelective(CountyUser record);

    int updateByPrimaryKey(CountyUser record);
}