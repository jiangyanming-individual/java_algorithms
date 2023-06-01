package com.twice_LiKo.链表;

import java.util.List;

/**
 * @author Lenovo
 * @date 2023/4/18
 * @time 8:23
 * @project java_算法
 **/
public class detectCycle_142 {


    public ListNode detectCycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if (fast == slow){
                ListNode index1=fast;
                ListNode index2=head;
                while (index1!=index2){
                    index1=index1.next;
                    index2=index2.next;
                }

                return index1; //返回环形的入口节点；
            }
        }
        return null;
    }
}
