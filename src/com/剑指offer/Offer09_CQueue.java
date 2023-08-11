package com.剑指offer;

import netscape.security.UserTarget;

import java.util.LinkedList;

/**
 * @author Lenovo
 * @date 2023/8/11
 * @time 10:37
 * @project java_算法
 **/
public class Offer09_CQueue {

//    public CQueue() {
//
//    }

    LinkedList<Integer> StackIn,StackOut;
    public Offer09_CQueue(){
        StackIn=new LinkedList<Integer>();
        StackOut=new LinkedList<Integer>();
    }
    //输入栈，
    public void appendTail(int value) {
        StackIn.addLast(value);
    }

    //输出栈：
    public int deleteHead() {

        //如果输出栈不为空，直接输出；
        if (!StackOut.isEmpty()) return StackOut.pollLast();
        if(StackIn.isEmpty()) return -1;//如果输入栈和输出栈都为空，直接返回-1
        while (!StackIn.isEmpty()){
            StackOut.push(StackIn.poll()); //push和 poll是一对

        }
        return StackOut.pollLast();//直接删除最后一个；也就是头节点
    }
}
