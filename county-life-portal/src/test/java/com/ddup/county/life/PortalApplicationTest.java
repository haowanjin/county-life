package com.ddup.county.life;

import cn.hutool.core.lang.UUID;
import cn.hutool.core.util.RandomUtil;
import com.ddup.county.life.entity.CountyUser;
import com.ddup.county.life.mapper.CountyUserMapper;
import com.ddup.county.life.uitl.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: hwj
 * @Description TODO
 * @create: 2021/11/16 17:55
 */

@SpringBootTest
public class PortalApplicationTest {
    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private CountyUserMapper userMapper;

    @Test
    void testRedis() {
        redisUtil.set("key12", 111);

        Integer key12 = redisUtil.get("key12");

        System.out.println(key12);
    }

    @Test
    void testUserMapper() {
        CountyUser user = new CountyUser();
        user.setCode(RandomUtil.randomStringUpper(16));
        user.setName("张三丰");
        user.setTelephone("18883832322");
        user.setUnionId("DASADS");

        userMapper.insert(user);

        System.out.println(userMapper.selectByPrimaryKey("YEMIII76OVE209E2"));
    }
}
