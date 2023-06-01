package com.LiKo.test;

/**
 * @author Lenovo
 * @date 2023/2/12
 * @time 21:45
 * @project java_算法
 **/
public interface List02<I extends Number> {

    //末尾add
    public void add(int data);

    //添加指定位置
    public void add(int index,int data);

    //移除
    public int remove(int index);

    //移除指定对象
    public boolean removes(int data);

    //获取数据
    public int get(int index);

    //size
    public int size();

}
