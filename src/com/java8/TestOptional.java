package com.java8;

import java.util.Optional;

/**
 * @author Lenovo
 * @date 2023/6/3
 * @time 16:04
 * @project java_算法
 **/


public class TestOptional {
    public static void main(String[] args) {
        String username=null;
        //如果username == null else设置成jack;
        username = Optional.ofNullable(username).orElse("jack");
        System.out.println(username);
    }
}
