package com.itheima;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class testBatis {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void fun01(){
        User user = userMapper.selectById(1);
        log.info("hello:{}",user.toString());
        System.out.println(user.getName());
    }
}
