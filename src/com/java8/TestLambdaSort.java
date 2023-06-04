package com.java8;

import com.java8.POJO.User;

import java.util.ArrayList;
import java.util.Comparator;

public class TestLambdaSort {

    public static void main(String[] args) {
        ArrayList<User> userLists = new ArrayList<>();
        userLists.add(new User("xiaoming",19));
        userLists.add(new User("milan",20));
        userLists.add(new User("jack",6));

        //升序排列：
        userLists.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        userLists.forEach(t->{
            System.out.println(t);
        });

        System.out.println("使用lambda表达式：");
        userLists.sort((o1,o2)->o1.getAge() - o2.getAge());

        userLists.forEach(t->{
            System.out.println(t);
        });
    }


}
