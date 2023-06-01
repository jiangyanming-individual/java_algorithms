package com.LiKo.List;

import java.util.Enumeration;

/**
 * @author Lenovo
 * @date 2023/2/6
 * @time 16:48
 * @project java_算法
 **/
public class reverseList_206 {

//    public ListNode reverseList(ListNode head){
//
//        ListNode cur = new ListNode();
//        cur=head;//cur指向头指针
//        ListNode pre=null;//pre是cur的前一个节点，指向空；
//
//        while (cur!=null){//循环终止条件；
//
//            ListNode tempNode=cur.next;//tempNode 用于保存cur.next节点；
//            cur.next=pre;//翻转指向；
//            pre=cur;//pre向前移动一位；
//            cur=tempNode;//cur前移一位
//
//        }
//
//        return pre;
//    }

    //使用递归的方式；
      public ListNode reverseList(ListNode head){

        return reverse(head,null);//初始化pre 和cur
      }

      public ListNode reverse(ListNode cur,ListNode pre){
          if(cur==null){
              return pre;//递归终止条件；
          }

          ListNode tempNode=cur.next;
          cur.next=pre;
          return reverse(tempNode,cur);//递归到下一层；
      }


}
