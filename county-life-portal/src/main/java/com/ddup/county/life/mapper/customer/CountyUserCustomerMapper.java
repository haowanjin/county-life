package com.ddup.county.life.mapper.customer;

import com.ddup.county.life.entity.CountyUser;
import com.ddup.county.life.mapper.CountyUserMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CountyUserCustomerMapper extends CountyUserMapper {
    List<CountyUser> queryUserByParams(CountyUser params);
}