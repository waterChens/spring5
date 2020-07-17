package com.waterchen.basic;

import com.sun.javafx.collections.MappingChange;

import java.util.*;

public class Person {

    private Set tels;
    private List addresses;
    private Map<String,String> qq;
    private Properties p;

    @Override
    public String toString() {
        return "Person{" +
                "tels=" + tels +
                ", addresses=" + addresses +
                ", qq=" + qq +
                ", p=" + p +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", emails=" + Arrays.toString(emails) +
                '}';
    }

    public Properties getP() {
        return p;
    }

    public void setP(Properties p) {
        this.p = p;
    }

    public Map<String, String> getQq() {
        return qq;
    }

    public void setQq(Map<String, String> qq) {
        this.qq = qq;
    }

    public List getAddresses() {
        return addresses;
    }

    public void setAddresses(List addresses) {
        this.addresses = addresses;
    }

    public Person() {
        System.out.println("gouzao");
    }

    private String name;
    private int age;
    private String[] emails;

    public String[] getEmails() {
        return emails;
    }

    public void setEmails(String[] emails) {
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTels(Set tels) {
        this.tels = tels;
    }

    public Set getTels() {
        return tels;
    }
}
