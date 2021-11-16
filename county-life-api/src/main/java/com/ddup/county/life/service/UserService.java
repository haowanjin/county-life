package com.ddup.county.life.service;

import com.ddup.county.life.entity.CountyUser;

import java.util.List;

/**
 * 用户 Service
 */
public interface UserService {
    List<CountyUser> queryUserByParams(CountyUser params);
}
