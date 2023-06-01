package com.LiKo;

/**
 * @author Lenovo
 * @date 2022/11/8
 * @time 10:09
 * @project java_workspace
 **/
public class ListNode {

    int value;
    ListNode next;//定义下一个节点；
        ListNode() {

    }//定义一个无参数的构造器：
    ListNode(int value) {
        this.value=value;
    }
    ListNode(int value,ListNode next){
        this.value=value;
        this.next=next;
    }

}
