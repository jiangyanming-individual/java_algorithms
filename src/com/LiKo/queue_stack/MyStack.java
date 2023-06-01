package com.LiKo.queue_stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Lenovo
 * @date 2023/2/19
 * @time 10:42
 * @project java_算法
 **/
public class MyStack {

    //用一个队列实现；将队首的元素重新加入到队列中；
    Queue<Integer> queue1;
    public MyStack() {
        queue1 = new LinkedList<>();//LinkedList实现queue的接口
    }

    public void push(int x) {
        int size=queue1.size();
        queue1.add(x);//先加入X；
        //将前面的元素都移动到X的后面；
        for (int i=0;i<size;i++){
            queue1.add(queue1.remove());
        }

    }

    public int pop() {
        return queue1.remove();
    }

    public int top() {

        return queue1.peek();
    }

    public boolean empty() {
        if (queue1.isEmpty()){
            return true;
        }
        return false;
    }
}
