package com.LiKo.List;

/**
 * @author Lenovo
 * @date 2023/2/18
 * @time 13:37
 * @project java_算法
 **/
public class detectCycle_144_02 {

    public ListNode detectCycle(ListNode head) {

        ListNode fast=head;//fast指向头节点；
        ListNode slow=head;
        while ( fast !=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if (slow == fast){
                //找到相遇的结点：
                ListNode index1=fast;
                ListNode index2=head;
                while(index1 !=index2){//不相遇的话就一直遍历；
                    index1=index2.next;
                    index2=index2.next;
                }
                return index1;//返回相遇节点，index1；
            }
        }
        return null;//如果没有的话就返回null；
    }
}
