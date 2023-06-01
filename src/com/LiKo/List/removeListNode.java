package com.LiKo.List;

/**
 * @author Lenovo
 * @date 2023/2/4
 * @time 20:38
 * @project java_算法
 **/
public class removeListNode {


    //不设置虚拟头节点的情况：
//    public ListNode removeElements(ListNode head, int val) {
//
//        //当头节点是要移除的元素时
//        while (head !=null && head.value==val){
//            head=head.next;
//        }
//
//        //设置一个游标：头节点不是目标元素；
//        ListNode cur=new ListNode();
//        cur=head;//cur指向头节点；
//        while (cur !=null){
//            //如果cur下一个节点的元素不为空，并且元素值还等于目标值的情况下：
//           if (cur.next !=null && cur.next.value==val){
//               cur.next=cur.next.next;
//           }else{
//               //不满足条件的话，cur直接移动到下一位；
//               cur=cur.next;
//           }
//        }
//
//        return head;
//    }

    //设置虚拟节点的情况下：
    public ListNode removeElements(ListNode head, int val) {


        ListNode dummy = new ListNode(-1,head);//设置一个虚拟的头节点；
//        ListNode pre=dummy; //移动头节点
        ListNode cur=dummy;

        while (cur.next!=null){

            if(cur.next.value==val){
                cur.next=cur.next.next;
            }else{
                cur=cur.next;
            }
        }
        return dummy;
    }
}
