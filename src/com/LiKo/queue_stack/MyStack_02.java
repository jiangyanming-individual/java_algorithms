package com.LiKo.queue_stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Lenovo
 * @date 2023/2/19
 * @time 14:53
 * @project java_算法
 **/
public class MyStack_02 {

    //用一个队列实现；将队首的元素重新加入到队列中；
    Queue<Integer> queue1;
    public MyStack_02() {
        queue1 = new LinkedList<>();//LinkedList实现queue的接口
    }

    public void push(int x) {
       queue1.add(x);

    }

    public int pop() {
        int size=queue1.size();
        size--;
        for (int i=1;i<=size;i++){
            queue1.add(queue1.remove());
            queue1.remove();
        }
        return queue1.remove();
    }

    public int top() {
        int size=queue1.size();
        size--;
        for (int i=1;i<=size;i++){
            queue1.add(queue1.remove());
            queue1.remove();
        }
        return queue1.peek();
    }

    public boolean empty() {
        if (queue1.isEmpty()){
            return true;
        }
        return false;
    }
}
