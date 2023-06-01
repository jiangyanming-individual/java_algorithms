package com.twice_LiKo.单调栈;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author Lenovo
 * @date 2023/4/6
 * @time 19:39
 * @project java_算法
 **/
public class nextGreaterElement_496 {

    public int[] nextGreaterElement(int [] nums1,int[] nums2){

        int[] res=new int[nums1.length];
        Arrays.fill(res,-1);//用-1填充；
        //单调栈：
        Deque<Integer> stack = new LinkedList<>();

        //将nums1用hashmap存起来；

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i=0;i<nums1.length;i++) {

            hashMap.put(nums1[i], i);// key=nums[i] value=i;
        }

        stack.push(0);//加入的index下标；

        for (int i=1;i<nums2.length;i++){

            //如果比nums[stack.peek()] :要小的话就直接入栈
            if(nums2[i]<=nums2[stack.peek()]){
                //保持栈是单调递增的；
                stack.push(i);
            }else{
                while (!stack.isEmpty() && nums2[i]>nums2[stack.peek()]){
                    //如果当前元素比栈定元素要大；
                    if (hashMap.containsKey(nums2[stack.peek()])){
                        //判断hashmap中是不是有这个栈顶元素；

                        //找到num1中的下标；然后赋值；
                        Integer num1_index = hashMap.get(nums2[stack.peek()]);
                        res[num1_index]=nums2[i];
                    }
                    //删除栈顶元素；
                    stack.poll();

                }
                stack.push(i);
            }

        }
        return res;
    }
}
