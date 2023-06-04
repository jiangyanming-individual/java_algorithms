package com.java8;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * @author Lenovo
 * @date 2023/6/2
 * @time 10:23
 * @project java_算法
 **/
public class TestLambda {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("xiaoming");
        list.add("milan");
        list.add("xiaoqiang");

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("==================================");
        //lambda表达式
        list.forEach(s -> {
            System.out.println(s);
        });

    }
}
