package com.LiKo.HashTable;

import java.util.HashMap;

/**
 * @author Lenovo
 * @date 2023/2/20
 * @time 18:43
 * @project java_算法
 **/
public class twoSum_1_02 {
    /****
     *
     *
     * 给定一个整数数组 nums 和一个整数目标值 target，
     * 请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     *
     * ***/
    public int[] twoSum(int[] nums, int target) {


        //key存入值， value存入下标；
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] res=new int[2];
        for (int i=0;i< nums.length;i++){
            int tar=target- nums[i];
            if (hashMap.containsKey(tar)){
                res[1]=i;
                res[0]=hashMap.get(tar);//得到目标元素的下标；
            }
            //如果不存在的，这直接加入到hashmap中；这样防止存在元素重复的可能性
            hashMap.put(nums[i],i);
        }
        return res;
    }
}
