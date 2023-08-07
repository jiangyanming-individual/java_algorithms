package com.剑指offer;

import java.util.List;

/**
 * @author Lenovo
 * @date 2023/8/7
 * @time 9:48
 * @project java_算法
 **/
public class Offer25_mergeTwoLists {

    //合并两个递增的序列；添加一个头节点:
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        //新定义一个头指针：
        ListNode dummaryHead=new ListNode(-1);
        ListNode curNode=dummaryHead; //当前指针指向头节点；

        while (l1!= null && l2!=null){

            //优先将最小的节点加入头节点上；
            if (l1.val <= l2.val){
                curNode.next=l1;
                l1=l1.next;
            }else {
                curNode.next=l2;
                l2=l2.next;
            }
            curNode=curNode.next;
        }

        //如果最后肯定留下一个链表；
        curNode.next = l1 == null ? l2 : l1;

        return dummaryHead.next;
    }
}
