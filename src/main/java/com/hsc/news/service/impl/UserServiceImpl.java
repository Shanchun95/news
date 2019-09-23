package com.hsc.news.service.impl;

import com.hsc.news.pojo.User;
import com.hsc.news.service.UserService;
import com.hsc.news.vo.R;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public R insert(User user) {
        return R.setOK();
    }

    @Override
    public R delecte(User user) {
        return R.setOK();
    }

    @Override
    public R update(User user) {
        return R.setOK();
    }

    @Override
    public R select(User user) {
        return R.setOK("OK",user);
    }

    @Override
    public R login() {
        return R.setOK("OK","index.html");
    }
}
