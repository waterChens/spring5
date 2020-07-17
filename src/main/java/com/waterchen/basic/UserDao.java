package com.waterchen.basic;

public interface UserDao {
    void save(User user);
    User queryUserByNameAndPassword(String name ,String password);
}
