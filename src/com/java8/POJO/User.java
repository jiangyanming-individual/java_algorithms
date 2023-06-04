package com.java8.POJO;

/**
 * @author Lenovo
 * @date 2023/6/2
 * @time 16:01
 * @project java_算法
 **/

public class User {

    private String username;
    private int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
