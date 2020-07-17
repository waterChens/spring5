package com.waterchen.basic.proxy;

import com.waterchen.basic.User;

public interface  UserService {
    void  register(User user);
    boolean login(String name,String Password);

}
