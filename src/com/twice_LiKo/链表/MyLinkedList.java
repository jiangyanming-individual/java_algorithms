package com.twice_LiKo.链表;


public class MyLinkedList {

    int size;//链表的数量：
    ListNode dummy;
    //假设链表中的所有节点下标从 0 开始。


    public MyLinkedList(){
        //初始化链表：
        size=0;
        dummy= new ListNode(0);//虚拟头节点：虚拟头节点的值是0;
    }

    //得到下标为index的节点
    public int get(int index){
        //获取链表中下标为 index 的节点的值。如果下标无效，则返回 -1 。

        //下标不满足的地方：
        if (index <0 || index >=size)
            return -1;

        ListNode cur=dummy.next;//当前节点是头节点
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val){
        //将一个值为 val 的节点插入到链表中第一个元素之前
        ListNode head=dummy.next;
        ListNode newNode = new ListNode(val);
        newNode.next=head;
        dummy.next=newNode;
        size++;//新加入一个节点，size++；

    }

    public void addAtTail(int val){
        //将一个值为 val 的节点追加到链表中作为链表的最后一个元素。
        ListNode newNode = new ListNode(val);
        ListNode cur=dummy; //指向虚拟头节点
        while (cur.next!=null){
            cur=cur.next;
        }
        cur.next=newNode;
        size++;//新加入一个节点；
    }

    public void addAtIndex(int index,int val){
        //一个值为 val 的节点插入到链表中下标为 index 的节点之前
        if (index<0) index=0;
        if (index>size) return;

        ListNode newNode = new ListNode(val);
        ListNode cur=dummy;//从虚拟头节点开始；

        //因为index是从0 开始；下标为index 说明移动到index需要index+1次
        for (int i=0;i<index;i++){
            //一共需要移动index次
            cur=cur.next;
        }
        newNode.next=cur.next;
        cur.next=newNode;
        size++;
    }

    public void deleteAtIndex(int index){
        // 如果下标有效，则删除链表中下标为 index 的节点。
        ListNode cur=new ListNode();
        cur= dummy;

        //不符合规定的节点：
        if (index <0 ||index >=size)
            return;
        size--;
        if (index == 0){
            //删除头节点；
            dummy=dummy.next;
            return;
        }
        //找到下标为：index-1的节点
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        //删除下标为index的节点；
        cur.next=cur.next.next;

    }

}
