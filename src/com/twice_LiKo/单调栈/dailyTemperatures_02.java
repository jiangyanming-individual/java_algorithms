package com.twice_LiKo.单调栈;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 单调栈每日的温度：
 */
public class dailyTemperatures_02 {

    public int[] dailyTemperatures(int[] temperatures){
        // 新建一个栈；
        Deque<Integer> stack = new LinkedList<>();

        //数组：刚开始初始化为0
        int[] result=new int[temperatures.length];
        stack.push(0);

        for (int i=1;i< temperatures.length;i++){

            if (temperatures[i]<=temperatures[stack.peek()]){
                stack.push(i);
            }else{
                while (!stack.isEmpty() && temperatures[i]> temperatures[stack.peek()]){
                    result[stack.peek()]=i-stack.peek();
                    stack.poll();//删除栈顶元素，保持一个单调递增的序列；
                }

                //当前元素进栈；保持是单调递增的栈；
                stack.push(i);
            }

        }
        return result;
    }
}
