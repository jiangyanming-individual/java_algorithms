package com.LiKo.queue_stack;

import java.util.Deque;
import java.util.Stack;

/**
 * @author Lenovo
 * @date 2023/2/18
 * @time 22:36
 * @project java_算法
 **/
public class MyQueue {//队列；
    Stack<Integer> stackIn;
    Stack<Integer> stackout;
    //构造方法
    public MyQueue() {
        stackIn = new Stack<>();//初始化栈；进栈
        stackout = new Stack<>();//出栈；
    }

    public void push(int x) {

        stackIn.push(x);
    }
    public int pop() {

        if(stackout.isEmpty()){//出栈为空的情况下，入栈的元素全部加入到出栈中
            //stackout栈为空的情况下：
            while(!stackIn.isEmpty()){//全部移到stackout栈中；
                stackout.push(stackIn.pop());
            }
        }
        //如果出栈不为空的情况下，直接删除
        return stackout.pop();
    }
    //获得队列的首元素：
    public int peek() {


        if (stackout.isEmpty()){
            //输入栈不为空，就将输入栈的所有元素放入输出栈中；
            while (!stackIn.isEmpty()){
                stackout.push(stackIn.pop());
            }
        }
        return stackout.peek();
    }

    public boolean empty() {
        if (stackIn.isEmpty() && stackout.isEmpty()){ //都为空的情况下返回true;
            return true;
        }
        return false;
    }

}
