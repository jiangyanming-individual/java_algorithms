package com.twice_LiKo.栈和队列;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author Lenovo
 * @date 2023/4/16
 * @time 7:46
 * @project java_算法
 **/
public class MyQueue_232 {

    Deque<Integer> stackIn;
    Deque<Integer> stackOut;
    //构造方法：
    public MyQueue_232(){
        stackIn = new LinkedList<>();
        stackOut=new LinkedList<>();
    }

    public void push(int x){

        //直接入栈：
        stackIn.push(x);
    }

    public int pop(){
        //出栈时，如果出栈为空，就直接将所有的元素都加入到出栈，然后弹出栈头；
        if (stackOut.isEmpty()){
            //如果出栈为空
            while (!stackIn.isEmpty()){
                stackOut.push(stackIn.poll());//进栈删除元素。出栈插入元素；
            }
        }

        //如果出栈不为空，直接删除栈顶元素；
        Integer result = stackOut.peek();
        stackOut.poll();
        return result;
        //如果出栈不为空，就直接弹出栈头
    }

    public int peek(){
        //获取栈头元素；

        //如果出栈为空，就将进栈的所有元素都加入到出栈中
        if (stackOut.isEmpty()){
            while (!stackIn.isEmpty()){
                stackOut.push(stackIn.poll());
            }
        }
        //如果出栈不为空的情况下；直接返回栈头元素；
        return stackOut.peek();
    }

    public boolean empty(){

        //只有当出栈和入栈都为空时才是空，反之步空；
        if (stackIn.isEmpty() && stackOut.isEmpty()){
            return true;
        }
        return false;
    }
}
