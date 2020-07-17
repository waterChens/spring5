package com.waterchen.basic;

public class UserDaoImpl implements UserDao {
    @Override
    public void save(User user) {
        System.out.println("保存用户信息");
    }

    @Override
    public User queryUserByNameAndPassword(String name, String age) {
        return null;
    }
}
