package com.waterchen.basic.proxy;

public class OrderServiceImpl implements OrderService {
    @Override
    public void showOrder() {
        System.out.println("原始方法中实现的方法");
    }
}
