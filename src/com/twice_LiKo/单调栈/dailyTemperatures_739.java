package com.twice_LiKo.单调栈;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Lenovo
 * @date 2023/4/6
 * @time 7:50
 * @project java_算法
 **/
public class dailyTemperatures_739 {


    public int[] dailyTemperatures(int[] temperatures){
        int [] res=new int[temperatures.length];
        Deque<Integer> stack = new LinkedList<>();

        stack.push(0);

        for (int i=1;i< temperatures.length;i++){
            if (temperatures[i]<=temperatures[stack.peek()]){
                stack.push(i);
            }else{


                while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                    res[stack.peek()]=i-stack.peek();//找到对应的下标；
                    stack.pop(); //小的出栈
                }
                stack.push(i);
            }
        }
        return res;
    }
}
