package com.LiKo.test;

/**
 * @author Lenovo
 * @date 2023/2/12
 * @time 22:46
 * @project java_算法
 **/
public class LinkedList02 implements List02<Number> {

    ListNode head=new ListNode(-1);
    ListNode dummyHead =new ListNode(-1);

    int size=0;
    public LinkedList02(){
        dummyHead.next=head;
    }

    @Override
    public void add(int data) {
        //末尾添加节点；
        ListNode cur=dummyHead;
        ListNode newNode =new ListNode(data);
        while (cur.next!=null){//cur的下一个不为空，接着遍历；
           cur=cur.next;
        }
        cur.next=newNode;
        size++;
    }

    @Override
    public void add(int index, int data) {
        if (index==0)
            index=0;
        if (index>=size)
            return;

        ListNode cur=dummyHead;//指向虚拟节点；
        ListNode newNode=new ListNode(data);
        size++;
        for (int i=0;i<index;i++){
            cur=cur.next;
        }
        newNode.next=cur.next; //newNode先指向要插入位置的元素；
        cur.next=newNode;//cur指向新的元素；

    }

    @Override
    public int remove(int index) {

        if (index< 0 || index >=size)
            return -1;

        ListNode cur=dummyHead;
        for (int i=0;i<index;i++){
            cur=cur.next;
        }
        size--;
        ListNode temp=cur.next;//存放要删除的节点；

        cur.next=cur.next.next;
        return temp.value;
    }

    @Override
    public boolean removes(int data) {
        boolean flag=false;
        ListNode cur=dummyHead;//cur指向虚拟节点；

        while (cur.next!=null){//判断cur的下一个节点是不是要删除的元素；
            if (cur.next.value==data){
                cur.next=cur.next.next;
                flag=true;
            }
            else{
                cur=cur.next;
            }
        }
        return flag;
    }

    @Override
    public int get(int index) {
        if(index >=size || index< 0)
            return -1;

        ListNode cur=dummyHead.next;//指向头指针，头指针下标为0
        for (int i=0;i<=index;i++){
            cur=cur.next;
        }
        return cur.value;
    }

    @Override
    public int size() {
        return size;
    }
    public void reverse(ListNode head){
        ListNode cur=head;
        ListNode pre=null;//设置一个前向指针；
        while (cur!=null){
            ListNode tempNode=cur.next;//用来保存cur的下一个元素；
            cur.next=pre;
            pre=cur;//pre移动到cur的位置；
            cur=tempNode;

        }

    }
}
