package com.LiKo.List;

/**
 * @author Lenovo
 * @date 2023/2/7
 * @time 11:20
 * @project java_算法
 **/
public class getIntersectionNode_面试题 {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        int A_len=0;
//        int B_len=0;
//
//        ListNode curA = new ListNode();
//        ListNode curB=new ListNode();
//        curA=headA;
//        curB=headB;
//        while (headA!=null){
//            A_len++;
//            curA=curA.next;
//        }
//
//        while (headB !=null){
//            B_len++;
//            curB=curB.next;
//        }
//
//        if(B_len > A_len){
//            //交换 AB的长度；
//            int tempLen;
//            tempLen=A_len;
//            A_len=B_len;
//            B_len=tempLen;
//
//            //交换节点；AB节点；
//            ListNode tempNode;
//            tempNode= curA;
//            curA=curB;
//            curB=tempNode;
//        }
//        int dispath=A_len -B_len;
//
//        for (int i=0;i<dispath;i++){
//            curA=curA.next;
//        }
//        while (curA!=null){
//            if (curA==curB){
//                return curA;
//            }
//            curA=curA.next;
//            curB=curB.next;
//        }
//        return null;
//    }



    /****
     * 第二种解法****/
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int A_len=0;
        int B_len=0;
        ListNode curA = new ListNode();
        ListNode curB=new ListNode();
        curA=headA;
        curB=headB;
        while (curA!=null){
            curA=curA.next;
            A_len++;
        }

        while (curB !=null){
            curB=curB.next;
            B_len++;
        }
        curA=headA;
        curB=headB;
        if (A_len==B_len) {
            for (int i=0;i<A_len;i++){
                if (curA ==curB){
                    return curA;
                }
                curA=curA.next;
                curB=curB.next;
            }
        }else if(A_len >B_len){
            int dislength=A_len-B_len;
            for (int i=0;i<dislength;i++){
                curA=curA.next;
            }
            for (int j=0;j<=B_len;j++){
                if (curA==curB) {
                    return curA;
                }
                curA=curA.next;
                curB=curB.next;
            }
        }else{
            int dislength=B_len-A_len;
            for (int i=0;i<dislength;i++){
                curB=curB.next;
            }

            for(int j=0;j<A_len;j++){
                if (curA==curB)
                    return curA;
                curA=curA.next;
                curB=curB.next;
            }
        }

        return null;
    }
}
