package com.LiKo.List;

/**
 * @author Lenovo
 * @date 2023/2/10
 * @time 14:51
 * @project java_算法
 **/
public class detectCycle_144 {

    public ListNode detectCycle(ListNode head) {

        ListNode fast=head;
        ListNode slow=head;
        //判断fast当前不为空，fast的下一个不为空；，然后直接跳；
        while (fast !=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast == slow){
                ListNode index1=fast;//两个指针相遇了
                ListNode index2=head;

                //x= (n-1)(y+z) +z
                while (index1 !=index2){//两个指针相遇的点就是入口
                    index1=index1.next;
                    index2=index2.next;
                }
                return index1;
            }
        }
        return null;
    }
}
