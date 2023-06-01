package com.LiKo.List;

/**
 * @author Lenovo
 * @date 2023/2/17
 * @time 22:55
 * @project java_算法
 **/
public class removeElements_209 {
    //删除链表中符合目标值的元素
    public ListNode removeElements(ListNode head, int val) {
        //设置虚拟头节点；
        ListNode dummyHead = new ListNode(-1, head);

        ListNode cur=dummyHead;
        while (cur.next !=null){
            if (cur.next.value == val) {
                cur.next = cur.next.next;//删除节点元素；
            }else{//如果cur不是目标值，就继续往下移动元素；
                cur=cur.next;
            }
        }
        return dummyHead.next;
    }
}
