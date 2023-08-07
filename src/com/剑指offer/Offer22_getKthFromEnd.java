package com.剑指offer;

/**
 * @author Lenovo
 * @date 2023/8/7
 * @time 9:26
 * @project java_算法
 **/
public class Offer22_getKthFromEnd {


    //1.解法 顺序遍历：需要遍历n-k+1个才可以遍历到倒数第K个；
    public ListNode getKthFromEnd01(ListNode head, int k) {
        int n= 0;
        ListNode node=null;

        for (node = head;node!=null;node=node.next){

            n++;
        }

        for (node=head;n>k;n--){
            node=node.next;
        }

        return node;
    }

    //2. 双指针的解法：

    public ListNode getKthFromEnd02(ListNode head, int k) {


        ListNode fast=head;
        ListNode slow=head;

//        for (int i=1;i<=k;i++){
//            fast=fast.next;
//        }
        while (fast!=null && k>0){
            fast=fast.next;
            k--;
        }
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }

        return slow;
    }
}
