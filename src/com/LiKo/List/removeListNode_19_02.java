package com.LiKo.List;

/**
 * @author Lenovo
 * @date 2023/2/18
 * @time 11:30
 * @project java_算法
 **/
public class removeListNode_19_02 {


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode();
        dummyHead.next=head;
        ListNode fastNode=dummyHead;//指向虚拟头节点；
        ListNode slowNode=dummyHead;//指向虚拟头节点；

        for (int i=0;i<n;i++){
            fastNode=fastNode.next;
        }
        fastNode=fastNode.next;//

        while (fastNode.next!=null) {
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }
        slowNode=slowNode.next.next;//移除链表中的元素；
        return dummyHead.next;
    }

}
