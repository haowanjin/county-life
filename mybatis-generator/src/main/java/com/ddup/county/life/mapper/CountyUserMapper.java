package com.ddup.county.life.mapper;

import com.ddup.county.life.entity.CountyUser;

public interface CountyUserMapper {
    int deleteByPrimaryKey(String code);

    int insert(CountyUser record);

    int insertSelective(CountyUser record);

    CountyUser selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(CountyUser record);

    int updateByPrimaryKey(CountyUser record);
}