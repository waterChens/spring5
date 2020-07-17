package com.waterchen;

import com.waterchen.basic.User;
import com.waterchen.basic.UserService;
import com.waterchen.basic.proxy.OrderServiceProxy;
import com.waterchen.basic.proxy.UserServiceProxy;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProxy {

    /*
    测试：静态代理
     */
    @Test
    public void test1(){
        UserServiceProxy userServiceProxy = new UserServiceProxy();
       // userServiceProxy.login("nihao","iii");
       // userServiceProxy.register(new User("nihao ","ddd"));

        System.out.println("-----------------");

        OrderServiceProxy orderServiceProxy = new OrderServiceProxy();
        orderServiceProxy.showOrder();
    }

    /*
    测试：动态代理
     */
    @Test
    public void test2(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext4.xml");
        com.waterchen.basic.proxy.UserService userService = (com.waterchen.basic.proxy.UserService)ctx.getBean("userService");
        userService.login("nihao...","9999");

    }
}
