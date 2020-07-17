package com.waterchen;

import com.waterchen.basic.Person;
import com.waterchen.basic.User;
import com.waterchen.basic.UserService;
import com.waterchen.basic.beanpost.Category;
import com.waterchen.basic.constructer.Customer;
import com.waterchen.basic.factorybean.ConnectionFactoryBean;
import com.waterchen.basic.life.Product;
import com.waterchen.basic.scope.Account;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class TestSpring {
    @Test
    public void testSpring(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person person = (Person)context.getBean("person");
        System.out.println("person = " + person);
    }
    @Test
    public void testSpring1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
/*        Person person =
                context.getBean("person",Person.class);
        System.out.println("person = " + person);*/
        //在spring配置文件中只能有一个person的bean标签
      /*  Person person = context.getBean(Person.class);
        System.out.println("person = " + person);*/

        //获取spring配置工厂bean标签的id值
        /*String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }*/

        //根据类型获取spring配置文件中对应的id
        /*for (String s : context.getBeanNamesForType(Person.class)) {
            System.out.println("s = " + s);
        }*/

        //用于判断是否存在指定id值的bean,只能判断id；不能根据判断name
      /*  boolean isPerson = context.containsBeanDefinition("p");
        System.out.println("isPerson = " + isPerson);*/

        //用于判断是否存在指定id值的bean;可以根据id和name值判断
        boolean isPerson = context.containsBean("p");
        System.out.println("isPerson = " + isPerson);

    }

    //只配置class属性，spring会默认生成id值
    @Test
    public void test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println("name = " + name);
        }
    }

    //用于测试bean的name属性
    @Test
    public void test3(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person bean = (Person)ctx.getBean("person");
        System.out.println("bean = " + bean);

    }


    //用于测试注入
    @Test
    public void test4(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person person = (Person)ctx.getBean("person");
        person.setAge(1);
        person.setName("nihao");
        System.out.println(person);
    }
    //用于测试配置文件中的属性注入
    @Test
    public void test5(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person person = (Person)ctx.getBean("person");
        System.out.println(person);
    }


    //用于测试配置文件中的属性注入jdk内置类型
    @Test
    public void test6(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person person = (Person)ctx.getBean("person");
        System.out.println(person);
    }
    //用于测试配置文件中的属性注入自定义变量赋值
    @Test
    public void test7(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserService userService = (UserService)ctx.getBean("userService");
        userService.register(new User("nihao","99999"));
    }
    //用于测试配置文件中的属性注入构造注入方法
    @Test
    public void test8(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Customer customer = (Customer) ctx.getBean("customer");
        System.out.println(customer);
    }
    //用于测试factorybean接口
    @Test
    public void test9(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Connection conn = (Connection) ctx.getBean("conn");
        Connection conn1 = (Connection) ctx.getBean("conn");
        ConnectionFactoryBean conn2 = (ConnectionFactoryBean) ctx.getBean("&conn");
        System.out.println(conn);
        System.out.println(conn1);
        System.out.println(conn2);
    }

    //用于测试实例工厂
    @Test
    public void test10(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Connection conn = (Connection) ctx.getBean("connF");
        System.out.println(conn);
    }
    //用于测试静态工厂
    @Test
    public void test11(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Connection conn = (Connection) ctx.getBean("connStatic");
        System.out.println(conn);
    }

    //用于测试简单对象的创建次数
    @Test
    public void test12(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Account conn = (Account) ctx.getBean("account");
        Account conn1 = (Account) ctx.getBean("account");
        System.out.println(conn);
        System.out.println(conn1);
    }

    //用于测试 生命周期
    @Test
    public void test13(){
        //创建过程
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        //Product account = (Product)ctx.getBean("product");
        ctx.close();
    }
    //用于测试 配置文件参数化
    @Test
    public void test14(){
        //创建过程
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext1.xml");
        Connection account = (Connection)ctx.getBean("conn");
    }

    //用于测试 自定义类型转换器
    @Test
    public void test15(){
        //创建过程
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext2.xml");
        com.waterchen.basic.converter.Person person = (com.waterchen.basic.converter.Person)ctx.getBean("person");
        System.out.println(person.getBirthday());

    }


    //用于测试 beanpostProcesser
    @Test
    public void test16(){
        //创建过程
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext3.xml");
        Category category = (Category)ctx.getBean("category");
        System.out.println(category.getName());


    }

}
