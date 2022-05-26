package com.ddup.county.life.service;

import com.ddup.county.life.dto.CommonDTO;
import com.ddup.county.life.entity.CountyUser;

import java.util.List;

/**
 * 用户 Service
 */
public interface UserService {
    /**
     * 查询用户信息
     *
     * @param params
     * @return
     */
    List<CountyUser> queryUserByParams(CountyUser params);

    /**
     * 保存用户信息
     * @param user
     * @return
     */
    CommonDTO<Integer> insertUser(CountyUser user);

}
