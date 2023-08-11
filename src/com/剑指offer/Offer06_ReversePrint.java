package com.剑指offer;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 1、使用递归和回溯的思想，利用递归进行数组的出栈和进栈；
 * 2、使用栈的方法，先入后出的思想
 */
public class Offer06_ReversePrint {

    //借助于栈的方式
    LinkedList<Integer> Stack=new LinkedList();
    public int[] reversePrint(ListNode head) {


        while (head!=null){
            Stack.add(head.val);
            head=head.next;
        }

        int[] res=new int[Stack.size()];
        for (int i=0;i<res.length;i++){
            res[i]= Stack.removeLast(); //删除最后一个元素
        }
        return  res;
    }


    //递归实现：
    List<Integer> nodeList=new ArrayList<Integer>();
    public int[] reversePrint02(ListNode head) {

        recur(head);
        int[] res=new int[nodeList.size()];

        for (int i=0;i<res.length;i++){
            res[i]=nodeList.get(i);//得到对应的值
        }
        return  res;
    }
    //回溯时，直接添加节点的值
    void recur(ListNode head){

        if (head==null) return;
        recur(head.next);
        nodeList.add(head.val);
    }
}
