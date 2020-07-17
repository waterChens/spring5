package com.waterchen.basic.factorybean;

import java.sql.Connection;
import java.sql.DriverManager;

public class StaticConnectionFactory {

    public static  Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.88.128:3306/test?useSSL=false","root","123456");
        return conn;
    }
}
