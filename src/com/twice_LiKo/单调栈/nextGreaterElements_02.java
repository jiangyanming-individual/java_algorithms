package com.twice_LiKo.单调栈;


import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 下一个更大的元素2；循环数据，进行求余数
 */
public class nextGreaterElements_02 {

    public int[] nextGreaterElement(int[] nums){
        //新建一个数组：初始化全为-1；
        int [] result=new int[nums.length];
        int length =nums.length;
        Arrays.fill(result,-1);
        //新建一个栈：
        Deque<Integer> stack = new LinkedList<>();
        stack.push(0);

        for (int i=1;i< length * 2;i++){
            if (nums[i % length]<=nums[stack.peek()]){
                stack.push(i % length);
            }else{
                while (!stack.isEmpty() && nums[i % length] > nums[stack.peek()] ){
                    //下一个最大元素：
                    result[stack.peek()] = nums[i % length];
                    stack.poll(); //删除栈顶元素
                }
                //下一个大的元素的index进栈；
                stack.push(i % length);
            }
        }
        return result;
    }
}
