package com.mpy.javaweb.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import com.mpy.javaweb.entity.User;
import com.mpy.javaweb.service.UserService;
import com.mpy.javaweb.commonResponse.ComResponse;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api("用户管理api")
@RestController
@RequestMapping
public class HelloController {
    //@RequestMapping(value = "hello", method= RequestMethod.GET )
    @GetMapping("/index")
    public String index() {
        return "hello spring boot22";
    }

    @Resource // 把service层userService注入进来
    private UserService userService;

    @ApiOperation("查询用户列表")
    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public ComResponse getService(@RequestParam(value="id", required=false) String id) {
        System.out.println("id:"+id);
        ComResponse<List<User>> objComResponse = new ComResponse<>();
//        if (id == "" || id == null) {
//            objComResponse.setMsg("id不能为空");
//            return objComResponse;
//        }
//        int queryId = Integer.valueOf(id).intValue();
        List<User> userList = userService.getList();
        objComResponse.setData(userList);

        System.out.println(userList);
        return objComResponse;
    }

    @ApiOperation("根据id查询用户")
    @RequestMapping(value = "/selectUserById", method = RequestMethod.GET)
    public ComResponse selectUserById (@RequestParam(value="id", required=false) String id) {
        System.out.println("id:"+id);
        ComResponse<User> objComResponse = new ComResponse<>();
        if (id == "" || id == null) {
            objComResponse.setMsg("id不能为空");
            return objComResponse;
        }
        int queryId = Integer.valueOf(id).intValue();
        User user = userService.selectById(queryId);
        objComResponse.setData(user);

        System.out.println(user);
        return objComResponse;
    }

    @ApiOperation("新增用户")
    @RequestMapping(value = "/userInsert", method = RequestMethod.POST)
    public ComResponse selectUserById (@RequestBody User user) {
        ComResponse<User> objComResponse = new ComResponse<>();

        int i = userService.insert(user);
        objComResponse.setData(null);
        System.out.println(i);
        return objComResponse;
    }

    @ApiOperation("删除用户")
    @RequestMapping(value = "/deleteUserByMap", method = RequestMethod.POST)
    public ComResponse deleteUserByMap (@RequestBody User user) {

        Map<String,Object> map = new HashMap<>();
        map.put("name", user.getName());
        int rows = userService.deleteByMap(map);
        System.out.println("删除记录数为："+rows);

        ComResponse<User> objComResponse = new ComResponse<>();
        objComResponse.setData(null);
        return objComResponse;
    }

    @ApiIgnore
    @PutMapping("/put")
    public String put() {
        return "put";
    }

    @ApiIgnore
    @DeleteMapping("/delete")
    public String delete() {
        return "delete";
    }
}