package com.daishuaiqing.blog.controller;

import com.daishuaiqing.blog.entity.User;
import com.daishuaiqing.blog.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@Api(value="用户controller",tags={"用户"})
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation("获取列表")
    @GetMapping("/user/list")
    public List<User> list(User user) {
        return userService.list(user);
    }

    @ApiOperation("获取用户信息")
    @GetMapping("/user/get")
    public User get(User user) {
        return userService.get(user);
    }

    @ApiOperation("修改用户信息")
    @ApiImplicitParam(name = "user", value = "单个用户信息", dataType = "User")
    @PutMapping("/user/update")
    public int update(@RequestBody User user) {
        return userService.update(user);
    }

    @ApiOperation("新增用户")
    @PostMapping("/user/save")
    public int save(@RequestBody User user) {
        return userService.save(user);
    }

    @ApiOperation("删除用户")
    @DeleteMapping("/user/delete")
    public int delete(User user) {
        return userService.delete(user);
    }

}
