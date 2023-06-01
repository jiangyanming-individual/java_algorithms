package com.twice_LiKo.链表;

/**
 * @author Lenovo
 * @date 2023/4/17
 * @time 8:06
 * @project java_算法
 **/
public class getIntersectionNode_2_07 {

    public ListNode getIntersectionNode(ListNode headA,ListNode headB){

        int len_A=0;
        int len_B=0;

        ListNode curA=headA;
        ListNode curB=headB;
        while (curA!=null){
            len_A++;
            curA=curA.next;

        }
        while (curB!=null){
            len_B++;
            curB=curB.next;
        }

        curA=headA;
        curB=headB;
        //使len_A是最大的 ;交换AB节点；
        if (len_B>len_A){
            int temp=len_A;
            len_A=len_B;
            len_B=temp; //细心一点啊兄弟；

            ListNode tempNode=curA;
            curA=curB;
            curB=tempNode;
        }

        int dis=len_A-len_B;
        while (dis>0){
            curA=curA.next;
            dis--;
        }

      while (curA!=null){

          if (curA == curB){
              return curA;
          }
          curA=curA.next;
          curB=curB.next;
      }
        //如果没有找到的话，就直接返回null;
        return null;

    }
}
