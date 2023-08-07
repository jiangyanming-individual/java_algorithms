package com.剑指offer;

import javax.print.attribute.standard.NumberUp;

/**
 * @author Lenovo
 * @date 2023/8/6
 * @time 17:02
 * @project java_算法
 **/


public class Offer18_deleteListNode {
    
    public  ListNode deleteNode01(ListNode head, int val) {

        ListNode dummaryHead = new ListNode(-1);

        dummaryHead.next=head;
        head=dummaryHead;

        while (dummaryHead.next!=null){

            if (dummaryHead.next.val == val){
                dummaryHead.next=dummaryHead.next.next;
            }

            //头节点：
            dummaryHead=dummaryHead.next;
        }
        return head.next;
    }

    public  ListNode deleteNode02(ListNode head, int val) {

        if (head.val == val) return head.next;

        ListNode pre=head; //前向指针
        ListNode cur =head.next; //当前指针；

        while (cur!=null && cur.val !=val){
            pre=cur;
            cur=cur.next;
        }

        //如果值相等；直接删除；
       if (cur!= null){
            pre.next=cur.next;
       }

       return head;
    }


}
