package com.剑指offer;

import javax.print.attribute.standard.NumberUp;

/**
 * @author Lenovo
 * @date 2023/8/11
 * @time 10:23
 * @project java_算法
 **/
public class Offer24_reverseList {


    //使用虚拟头节点：
    public ListNode reverseList(ListNode head) {
        ListNode dummaryHead=  new ListNode(-1);
        dummaryHead.next=null;

        ListNode cur =head;

        while (cur!=null){
            //保存cur的下一个节点；
            ListNode tempNode=cur.next;

            //翻转节点的指向；
            cur.next=dummaryHead.next;
            dummaryHead.next=cur;//头节点指向cur

            cur=tempNode;//cur 前移一个节点

        }
        return dummaryHead.next;
    }
}
