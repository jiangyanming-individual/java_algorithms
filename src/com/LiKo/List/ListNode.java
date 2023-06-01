package com.LiKo.List;

import java.util.List;

/**
 * @author Lenovo
 * @date 2023/2/4
 * @time 20:30
 * @project java_算法
 **/
public class ListNode {
    public int value;
    ListNode next;

    public ListNode(){

    }

    public ListNode(int value){
        this.value=value;
    }

    public ListNode(int value,ListNode next) {
        this.value = value;
        this.next = next;
    }
}
