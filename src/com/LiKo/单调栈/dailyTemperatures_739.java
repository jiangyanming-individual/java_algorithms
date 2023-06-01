package com.LiKo.单调栈;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author Lenovo
 * @date 2023/4/4
 * @time 8:47
 * @project java_算法
 **/
public class dailyTemperatures_739 {

    public int[] dailyTemperatures(int[] temperatures){


        Deque<Integer> stack = new LinkedList<>(); //双头栈；
        int [] res=new int[temperatures.length];

        stack.push(0);//加入第一个元素的index=0

        for (int i=1;i< temperatures.length;i++){

            if (temperatures[i]<= temperatures[stack.peek()]){
                //如果当前元素小于等于tempertures[stack.peek()],就直接加入到栈中
                stack.push(i);
            }else{
                //大于栈顶的元素：
                while (!stack.isEmpty() && temperatures[i]> temperatures[stack.peek()]){
                    res[stack.peek()]=i-stack.peek();
                    stack.poll(); //删除栈头；
                }
                //如果都删除了比当前元素小的；就直接加入当前的元素；
                stack.push(i);
            }
        }

        return res;
    }

}
