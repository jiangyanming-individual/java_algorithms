package com.LiKo.queue_stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Lenovo
 * @date 2023/2/22
 * @time 19:38
 * @project java_算法
 **/
public class MyQueue_max {


    Deque<Integer> deque=new LinkedList();

    //删除元素，如果要删除的元素与队头的元素相等的话就要删除
    void poll(int val){
        //队列不为空
        while (!deque.isEmpty() && val == deque.peek()){
            deque.poll();
        }
    }

    //添加元素
    void add(int val){
        //如果要添加的元素大于队尾的元素的话，就需要将队尾元素删除，保证是单调递减的队列
        while (!deque.isEmpty() && val > deque.getLast()){
            deque.removeLast();
        }
        //如果不大于直接加入；
        deque.add(val);
    }
    //获取栈顶元素
    int peek(){
        return deque.peek() ;
    }
}
