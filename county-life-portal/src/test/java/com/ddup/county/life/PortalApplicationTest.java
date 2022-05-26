package com.ddup.county.life;

import com.ddup.county.life.entity.CountyUser;
import com.ddup.county.life.mapper.customer.CountyUserCustomerMapper;
import com.ddup.county.life.service.UserServiceImpl;
import com.ddup.county.life.uitl.RedisUtil;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author: hwj
 * @Description TODO
 * @create: 2021/11/16 17:55
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class PortalApplicationTest {
    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private CountyUserCustomerMapper userMapper;

    @Autowired
    private UserServiceImpl userService;

    @Test
    void testRedis() {
        redisUtil.set("key12", 111);

        Integer key12 = redisUtil.get("key12");

        System.out.println(key12);
    }

    @Test
    void testUserMapper() {
        CountyUser user = new CountyUser();
        // user.setCode(RandomUtil.randomStringUpper(16));
        user.setName("张三丰");
        /*user.setTelephone("18883832322");
        user.setUnionId("DASADS");

        userMapper.insert(user);
*/
        List<CountyUser> countyUsers = userService.queryUserByParams(user);
        System.out.printf("listSize=%s \n", countyUsers.size());
        System.out.println(userMapper.selectByPrimaryKey("YEMIII76OVE209E2"));
    }
}
