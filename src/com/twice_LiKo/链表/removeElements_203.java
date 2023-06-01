package com.twice_LiKo.链表;

/**
 * @author Lenovo
 * @date 2023/4/12
 * @time 9:41
 * @project java_算法
 **/
public class removeElements_203 {

    public ListNode removeElements(ListNode head,int val){

        //设置节点:
        ListNode dummyHead  = new ListNode(-1, head);
        ListNode cur= new ListNode();//设置一个节点指针指向虚拟头节点;
        cur=dummyHead;

        while (cur.next!=null){
            if (cur.next.val == val){
                //如果cur的下一个元素满足条件,就直接删除
                cur.next=cur.next.next;
            }else {
                //如果不满足就直接继续遍历下一个;
                cur=cur.next;
            }
        }
        return dummyHead.next;//返回头节点;
    }
}
