package com.twice_LiKo.栈和队列;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Lenovo
 * @date 2023/4/16
 * @time 8:13
 * @project java_算法
 **/


//使用队列来实现栈
public class MyStack_225 {

    Queue<Integer> queue;
    public MyStack_225(){
        //初始化栈：
        queue=new LinkedList<>();
    }

    public void push(int x){

        int size = queue.size();
        //将新得到x的直接插入到队头；

        queue.add(x);
        while (size>0){
            Integer poll = queue.poll();
            queue.add(poll);
            size--;
        }

    }
    public int pop(){

        return queue.poll();
    }

    public int top(){

        return queue.peek();
    }

    public boolean empty(){
        if (queue.isEmpty()){
            return true;
        }
        return false;
    }
}
