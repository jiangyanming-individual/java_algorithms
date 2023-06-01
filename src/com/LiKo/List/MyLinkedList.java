package com.LiKo.List;

/**
 * @author Lenovo
 * @date 2023/2/5
 * @time 20:19
 * @project java_算法
 **/

public class MyLinkedList {

    int size; //定义节点的大小
    ListNode dummy;
    public MyLinkedList() {
        size=0;
        dummy = new ListNode(0);//设置一个虚拟的节点
    }

    public int get(int index) {

        if(index < 0 || index >=size)//头节点下标从0开始
            return -1;
        ListNode cur = dummy.next;//设置头指针；

        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur.value;
    }

    public void addAtHead(int val) {

        ListNode newNode = new ListNode(val); //设置一个新的节点；
        newNode.next=dummy.next;
        dummy.next=newNode;
        size++;
    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        ListNode cur=dummy; //指向虚拟头节点；
        while (cur.next !=null){
            cur=cur.next;
        }
        cur.next=newNode;
        size++;
    }

    public void addAtIndex(int index, int val) {
        ListNode newNode = new ListNode(val); //设置一个新的节点；
        if (index<0)
            index=0;
        if (index > size)
            return;
        size++;
        ListNode cur = new ListNode();
        cur=dummy;//指向虚拟头节点；
        for(int i=0;i<index;i++){//找到第index-1节点；
            cur=cur.next;
        }
        newNode.next=cur.next;
        cur.next=newNode;

    }

    public void deleteAtIndex(int index) {
        ListNode cur = new ListNode();
        cur=dummy;
        if(index < 0 || index >=size)//超出界限值了
            return;
        size--;
        if(index == 0){
            dummy=dummy.next;
            return;
        }

        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        cur.next=cur.next.next;//直接将节点指向下下个节点；

    }
}
