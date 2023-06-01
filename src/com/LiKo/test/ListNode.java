package com.LiKo.test;

/**
 * @author Lenovo
 * @date 2023/2/12
 * @time 22:44
 * @project java_算法
 **/
public class ListNode {

    int value;
    ListNode next;

    public ListNode(){

    }

    public ListNode(int value){
        this.value=value;
    }
    public ListNode(ListNode next,int value){
        this.value=value;
        this.next=next;
    }
}
