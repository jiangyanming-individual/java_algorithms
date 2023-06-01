package com.twice_LiKo.链表;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/4/12
 * @time 9:36
 * @project java_算法
 **/



/**
 *
 * 对于链表节点的定义
 * **/
public class ListNode {

    int val;
    ListNode next;

    public ListNode(){

    }
    public ListNode(int val){
        this.val=val;
    }

    public ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }

}
