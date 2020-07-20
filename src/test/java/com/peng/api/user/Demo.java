package com.peng.api.user;

import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Mock Bean 测试类
 *
 * @author : peng
 * @date : 2020-07-18
 */
@SpringBootTest
public class Demo {

    @MockBean
    private UserPO userPO;
    @Autowired
    private RedisTemplate redisTemplate;

    // 测试lei
    @Test
    public void test() {
        MockitoAnnotations.initMocks(this);
        System.out.println(userPO);

        System.out.println("sssss");
    }

    // 测试方法
    @Test
    public void test111() {
        Class<String> stringClass = String.class;

        String simpleName = stringClass.getSimpleName();
        String str = "Peng";
        String s = str.toLowerCase();
        System.out.println(s);
        System.out.println(simpleName);
    }


}
