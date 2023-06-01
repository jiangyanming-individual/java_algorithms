package com.twice_LiKo.链表;

/**
 * @author Lenovo
 * @date 2023/4/15
 * @time 16:10
 * @project java_算法
 **/
public class reverseList_206 {

    //使用双指针法：
//    public ListNode reverseList(ListNode head){
//
//        ListNode cur=head;
//        ListNode pre=null;
//
//        while (cur!=null){
//            //保存cur的下一个节点
//            ListNode temp=cur.next;
//            cur.next=pre;
//            pre=cur;//pre前移
//            cur=temp;//cur前移；
//        }
//
//        return pre;
//    }

    //使用虚拟头节点：
    public ListNode reverseList(ListNode head){

        ListNode dummy = new ListNode();
        dummy.next=null;

        ListNode cur=head;
        while (cur!=null){
            //用于保存下一个元素；
            ListNode tempNode=cur.next;
            cur.next=dummy.next;
            dummy.next=cur;

            cur=tempNode;//cur前移一个节点；
        }

        return dummy.next;
    }
}
