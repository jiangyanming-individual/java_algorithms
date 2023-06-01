package com.LiKo.单调栈;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Lenovo
 * @date 2023/4/4
 * @time 9:49
 * @project java_算法
 **/
public class nextGreaterElements_503 {

    public int[] nextGreaterElements(int[] nums){

        //新建一个栈
        Deque<Integer> stack = new LinkedList<>();
        int[] res=new int[nums.length];
        int length=nums.length;

        //初始化数组：
        Arrays.fill(res,-1);

        stack.push(0);
        for (int i=1;i< length *2;i++){

            if (nums[i % length]<= nums[stack.peek()]){
                stack.push(i % length);//进行求余数；
            }else{
                while (!stack.isEmpty() && nums[i % length] > nums[stack.peek()]){

                    res[stack.peek()] = nums[i % length]; //更新res;进行取余数的操作；
                    stack.poll();//栈头出栈；
                }
                stack.push(i % length);
            }
        }

        return res;
    }
}
