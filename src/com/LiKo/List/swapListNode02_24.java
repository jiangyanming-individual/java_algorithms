package com.LiKo.List;

import java.util.List;

/**
 * @author Lenovo
 * @date 2023/2/7
 * @time 10:00
 * @project java_算法
 **/
public class swapListNode02_24 {

    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode();
        dummy.next=head;
        ListNode cur=dummy;
        return swap(dummy,cur);

    }

    public ListNode swap(ListNode dummy,ListNode cur){
        if(cur.next ==null || cur.next.next ==null)
            return dummy.next;
        ListNode temp1=cur.next;
        ListNode temp2= cur.next.next.next;
        cur.next=cur.next.next;
        cur.next.next=temp1;
        temp1.next=temp2;
        cur=cur.next.next;
        return swap(dummy,cur);
    }

}
