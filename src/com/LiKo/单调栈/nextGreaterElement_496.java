package com.LiKo.单调栈;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author Lenovo
 * @date 2023/4/4
 * @time 9:14
 * @project java_算法
 **/
public class nextGreaterElement_496 {

    public int[] nextGreaterElement(int[] nums1,int[] nums2){

        //新建一个hashmap
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        //新建一个栈；
        Deque<Integer> stack= new LinkedList<>();

        int [] res=new int[nums1.length];
        Arrays.fill(res,-1); //初始化全部为-1；

        for (int i=0;i<nums1.length;i++){
            hashMap.put(nums1[i],i);//key=nums1[i] ,value=i;
        }

        stack.push(0);
        for (int i=1;i<nums2.length;i++){

            //单调栈的部分：
            if (nums2[i]<=nums2[stack.peek()]){
                stack.push(i);
            }else{

                while (!stack.isEmpty() && nums2[i] > nums2[stack.peek()]){
                    //当前元素比栈头元素要大：
                    if (hashMap.containsKey(nums2[stack.peek()])){
                        //如果hashmap中存在；nums1[i] ==nums2[j]，就需要获取对应的nums1[index]
                        Integer index = hashMap.get(nums2[stack.peek()]);//得到num1对应的下标：
                        res[index]=nums2[i];//将对应的元素放入nums1
                    }
                    stack.poll();//删除栈头元素；
                }
                stack.push(i);//加入当前元素的index；
            }
        }
        return res;
    }
}
