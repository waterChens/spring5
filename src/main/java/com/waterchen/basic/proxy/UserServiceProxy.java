package com.waterchen.basic.proxy;

import com.waterchen.basic.User;

public class UserServiceProxy implements UserService {
    private UserServiceImpl userService = new UserServiceImpl();
    @Override
    public void register(User user) {
        System.out.println("----log---");
        userService.register(user);
    }

    @Override
    public boolean login(String name, String Password) {
        System.out.println("-----log--");
        return userService.login(name, Password);
    }
}
