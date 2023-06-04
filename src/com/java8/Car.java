package com.java8;

/**
 * @author Lenovo
 * @date 2023/6/2
 * @time 10:02
 * @project java_算法
 **/


class Car implements Vehicle,FourWheeler{
    public void print(){
        Vehicle.super.print();//调用父类的接口：
        FourWheeler.super.print();
        Vehicle.blowHron();//静态方法直接接口名调用；

        System.out.println("我是一辆四轮汽车");
    }
}


interface Vehicle{
    default void print(){
        System.out.println("我是一辆车!");
    }

    static void blowHron(){
        System.out.println("按喇叭！");
    }
}

interface FourWheeler{
    default void print(){
        System.out.println("我是一辆四轮车!");
    }
}

