package com.twice_LiKo.哈希表;

import java.util.HashMap;

/**
 * @author Lenovo
 * @date 2023/4/22
 * @time 8:36
 * @project java_算法
 **/
public class twoSum_1 {
    public int[] twoSum(int[] nums,int tartget){

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        //返回结果是一个数组；
        int[] res = new int[2];
        for (int i=0;i<nums.length;i++){

            int tar2=tartget - nums[i];
            if (hashMap.containsKey(tar2)){
                //如果hashmap中存在对对应的第二个元素：
                res[0]=i;
                res[1]=hashMap.get(tar2);
            }
            //如果没有就将nums[i]存入到hashmap中；
            hashMap.put(nums[i],i);// key =元素 value=index;
        }

        return res;
    }
}
