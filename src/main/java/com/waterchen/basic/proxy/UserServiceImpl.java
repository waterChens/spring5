package com.waterchen.basic.proxy;

import com.waterchen.basic.User;

public class UserServiceImpl implements UserService {
    @Override
    public void register(User user) {
        System.out.println("核心业务+Dao");
    }

    @Override
    public boolean login(String name, String Password) {
        System.out.println("原始方法的登录方法");
        return true;
    }
}
