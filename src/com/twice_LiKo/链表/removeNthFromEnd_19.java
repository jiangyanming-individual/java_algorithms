package com.twice_LiKo.链表;

/**
 * @author Lenovo
 * @date 2023/4/16
 * @time 7:31
 * @project java_算法
 **/
public class removeNthFromEnd_19 {
    public ListNode removeNthFromEnd(ListNode head,int n){

        ListNode dummyHead=new ListNode();
        dummyHead.next=head;//虚拟头节点；

        //fast 和 slow 都指向虚拟头节点：
        ListNode fast=dummyHead;
        ListNode slow=dummyHead;
        //fast 和 slow 相差n+1 个节；当fast移动到最后，slow指向要删除节点的前一个节点；

        //fast移动到n+1个位置
        while (fast!=null && n>0){
            fast=fast.next;
            n--;
        }
        fast=fast.next;

        while (fast !=null){
            fast=fast.next;
            slow=slow.next;
        }

        slow=slow.next.next;//删除节点；
        return dummyHead.next;
    }
}
