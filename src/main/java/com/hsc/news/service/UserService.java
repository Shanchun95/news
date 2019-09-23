package com.hsc.news.service;

import com.hsc.news.pojo.User;
import com.hsc.news.vo.R;

public interface UserService {
    //新增用户
    R insert(User user);
    //删除用户
    R delecte(User user);
    //修改用户信息
    R update(User user);
    //查询用户信息
    R select(User user);
    //登录接口
    R login();
}
