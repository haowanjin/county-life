package com.ddup.county.life.mapper;

import com.ddup.county.life.entity.CountyUserToken;

public interface CountyUserTokenMapper {
    int deleteByPrimaryKey(String tokenId);

    int insert(CountyUserToken record);

    int insertSelective(CountyUserToken record);

    CountyUserToken selectByPrimaryKey(String tokenId);

    int updateByPrimaryKeySelective(CountyUserToken record);

    int updateByPrimaryKey(CountyUserToken record);
}