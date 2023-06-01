package com.LiKo.List;

/**
 * @author Lenovo
 * @date 2023/2/6
 * @time 18:30
 * @project java_算法
 **/


//24题交换节点；
public class swapListNode01_24 {


    public ListNode swapPairs(ListNode head) {

        ListNode dummyHead = new ListNode();
        dummyHead.next=head;//设置虚拟头节点；
        ListNode cur=dummyHead;

        while (cur.next !=null && cur.next.next !=null){
            ListNode tempNode1=cur.next;
            ListNode tempNode2=cur.next.next;

            cur.next=cur.next.next;
            cur.next.next=tempNode1;//第一个1节点；
            cur.next.next.next=tempNode2;//第二个节点

            //交换完后cur 后移两个节点；

            cur= cur.next.next;
        }

        return dummyHead.next; //返回头节点；
    }

}


//    ListNode dummy = new ListNode();
//    dummy.next=head;//设置虚拟头节点；指向head;
//    ListNode cur=dummy;//设置指针，指向虚拟头节点
//
//                while (cur.next !=null && cur.next.next!=null){//循环终止的条件；
//
//                //设置两个临时的节点；存放
//                ListNode temp1=cur.next;//
//                ListNode temp2=cur.next.next.next;
//
//                cur.next=cur.next.next;
//                cur.next.next=temp1;
//                cur.next.next.next=temp2;
//
//                //交换完后，cur向后移动两个节点；移动到2 ,然后在判断2的下一个节点和下下个节点；
//                cur=cur.next.next;