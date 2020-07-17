package com.waterchen.basic.life;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Product implements InitializingBean, DisposableBean {
    public Product() {
        System.out.println("product.Product");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("zhixing set方法");
        this.name = name;
    }

    private String name;

    //这个是初始化方法：做一些初始化操作
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("product.afterPropertiesSet");
    }
    public void myInit() throws Exception {
        System.out.println("product22222.afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy product");
    }

    public void myDestroy() throws Exception {
        System.out.println("Destroy myDestroy");
    }


}
