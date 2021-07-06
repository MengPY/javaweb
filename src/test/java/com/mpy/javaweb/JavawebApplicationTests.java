package com.mpy.javaweb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.beans.factory.annotation.Autowired;
import com.mpy.javaweb.entity.User;
import com.mpy.javaweb.mapper.UserMapper;

import java.util.*;


@SpringBootTest
class JavawebApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        for(User user: userList) {
            System.out.println(user);
        }
    }

    @Test public void mapTest() {
        //创建Map对象
        Map<String, String> map = new HashMap<String,String>();
        //给map中添加元素
        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("刘德华", "柳岩");
        //获取Map中的所有key与value的对应关系
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        System.out.println(entrySet);

    }

}
