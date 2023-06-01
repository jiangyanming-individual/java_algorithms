package com.twice_LiKo.单调栈;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Lenovo
 * @date 2023/4/7
 * @time 9:18
 * @project java_算法
 **/
public class nextGreaterElements_503 {


    public int [] nextGreaterElement(int[] nums){
        //使用循环数组：
        int [] res=new int[nums.length];
        int length= nums.length;
        Deque<Integer> stack = new LinkedList<>();
        stack.push(0);

        Arrays.fill(res,-1);//初始化全为-1；

        for (int i=1;i< length * 2;i++){

            if (nums[i % length] <= nums[stack.peek()]){
                stack.push(i % length);
            }else{
                while (!stack.isEmpty() && nums[i % length] > nums[stack.peek()]){
                    Integer index = stack.peek();
                    res[index % length]= nums[i % length];//直接赋值
                    stack.poll();//栈顶元素出栈
                }
                stack.push(i % length);
            }
        }
        return res;
    }
}
