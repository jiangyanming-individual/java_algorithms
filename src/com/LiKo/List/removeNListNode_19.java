package com.LiKo.List;

/**
 * @author Lenovo
 * @date 2023/2/7
 * @time 10:32
 * @project java_算法
 **/
public class removeNListNode_19 {

    //让fast指针和slow 指针相差n+1,slow刚好指向要删除节点的前一个节点；
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode();
        dummyHead.next=head;
        ListNode fast=dummyHead;
        ListNode slow=dummyHead;


        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        fast=fast.next;

        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow=slow.next.next;//删除倒数第n元素，slow直接指向 倒数第n-1个元素；
        return dummyHead.next;
    }
}
