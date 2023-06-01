package com.twice_LiKo.链表;

/**
 * @author Lenovo
 * @date 2023/4/15
 * @time 20:07
 * @project java_算法
 **/
public class swapPairs_24 {
    public ListNode swapPairs(ListNode head){
        //设置虚拟头节点：
        ListNode dummyHead = new ListNode();
        dummyHead.next=head;
        //当前节点指向虚拟头节点：
        ListNode cur=dummyHead;

        while (cur.next!=null && cur.next.next!=null){

            ListNode tempNode1=cur.next.next.next;//保存第三个节点；
            ListNode tempNode2=cur.next;//暂时存储第一个节点；

            cur.next=cur.next.next;//第一个节点变为第二个
            cur.next.next=tempNode2;//第二个节点变为第一个；
            cur.next.next.next=tempNode1;

            cur= cur.next.next;//cur移动第二个节点；好开始第三个节点和第四个节点的运算；然后开始第二轮循环

        }
        return dummyHead.next;
    }
}
