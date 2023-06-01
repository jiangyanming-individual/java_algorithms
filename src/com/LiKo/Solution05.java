package com.LiKo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2022/11/8
 * @time 10:08
 * @project java_workspace
 **/


public class Solution05 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur=head;//设置头节点；


        if (cur==null){
            return head;
        }

        while (cur.next!=null){
            if (cur.value==cur.next.value){
                cur.next=cur.next.next;
            }else{
                cur=cur.next;
            }
        }
        return head;
    }

}
