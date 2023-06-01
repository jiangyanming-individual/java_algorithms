package com.LiKo.HashTable;

import java.util.HashMap;

/**
 * @author Lenovo
 * @date 2023/2/10
 * @time 20:24
 * @project java_算法
 **/
public class twoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numberMap = new HashMap<>();//key是值 ，value是index下标；
        int[] res=new int[2];
        int distence;
        for (int i=0;i<nums.length;i++){
            distence=target-nums[i];
            if(numberMap.containsKey(distence)){//已经有差值了；
                res[0]=numberMap.get(distence);
                res[1]=i;
                break;
            }
            numberMap.put(nums[i],i);
        }
        return res;
    }
}
