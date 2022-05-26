package com.ddup.county.life.service;

import com.ddup.county.life.dto.CommonDTO;
import com.ddup.county.life.entity.CountyUser;
import com.ddup.county.life.entity.CountyUserExample;
import com.ddup.county.life.mapper.customer.CountyUserCustomerMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: hwj
 * @Description 用户 Service
 * @create: 2021/11/16 19:38
 */
@Service
public class UserServiceImpl implements UserService {
    private final CountyUserCustomerMapper userMapper;

    public UserServiceImpl(CountyUserCustomerMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<CountyUser> queryUserByParams(CountyUser params) {
        CountyUserExample example = new CountyUserExample();
        CountyUserExample.Criteria criteria = example.createCriteria();
        criteria.andNameLike(params.getName());
        criteria.andAddressLike(params.getAddress());
        criteria.andUnionIdEqualTo(params.getUnionId());
        criteria.andTelephoneEqualTo(params.getTelephone());

        return userMapper.selectByExample(example);
    }

    @Override
    public CommonDTO<Integer> insertUser(CountyUser user) {
        int count = userMapper.insert(user);
        return CommonDTO.success(count);
    }
}
