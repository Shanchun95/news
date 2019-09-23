package com.hsc.news.controller;

import com.hsc.news.pojo.User;
import com.hsc.news.service.UserService;
import com.hsc.news.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;
    //新增用户信息
    @RequestMapping("/aa")
    @ResponseBody
    public User a(){

        return new User();
    }
   /* @PostMapping("/addUser")
    public R addUser(User user){
        return userService.insert(user);
    }
    //修改用户信息
    @PostMapping("/updateUser")
    public R update(User user){
        return userService.update(user);
    }
    //删除用户信息
    @GetMapping("/deleteById")
    public R deleteById(User user){
        return userService.delecte(user);
    }
    //查询用户信息
    @GetMapping("/selectUser")
    public R select(User user){
        return userService.select(user);
    }
    @GetMapping("/login")
    public R login(){
        return userService.login();
    }*/

}
