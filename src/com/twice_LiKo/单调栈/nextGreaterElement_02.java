package com.twice_LiKo.单调栈;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * 下一个更大的元素：
 */
public class nextGreaterElement_02 {

    public int[] nextGreaterElement(int[] nums1,int[] nums2){

        // 使用一个数组：
        int[] result=new int[nums1.length];
        Arrays.fill(result,-1);

        //新建一个hashmap用来存放num1
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i=0;i< nums1.length;i++){
            hashMap.put(nums1[i],i);// key =nums1[i], value=index;
        }

        //新建一个栈
        Deque<Integer> stack = new LinkedList<>();
        stack.push(0);
        for (int i=1;i< nums2.length;i++){
            if (nums2[i]<=nums2[stack.peek()]){
                //如果比栈顶元素小，直接加入栈中，
                stack.push(i);
            }else{
                while (!stack.isEmpty() && nums2[stack.peek()]<nums2[i]){
                    //判断栈顶元素是不是在nums1中；
                    if (hashMap.containsKey(nums2[stack.peek()])){
                        //求出比num1中更大的元素的值；
                        result[hashMap.get(nums2[stack.peek()])]=nums2[i];
                    }
                    //删除栈顶元素：
                    stack.poll();
                }
                //加入当前元素
                stack.push(i);
            }
        }
        return result;
    }

}
