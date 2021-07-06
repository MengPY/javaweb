package com.mpy.javaweb.service;

import com.mpy.javaweb.entity.User;
import com.mpy.javaweb.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * service层调用持久层
 * @Service // 让spring扫描到这个包
 *
 * @Autowired和@Resource
 * 两个注解都可以把一个类注入进来（相当于import）
 * Resource JDK自带的
 * Autowired spring自带的
 */
@Service // 让spring扫描到这个包
public class UserService {
    @Resource
    public UserMapper userMapper;
    public List<User> getList() {
        return userMapper.selectList(null);
    }

    public User selectById(int id) {
        return userMapper.selectById(id);
    }

    public int insert(User user) {
        return userMapper.insert(user);
    }

    public int deleteByMap(Map user) {
        return userMapper.deleteByMap(user);
    }
}