package com.LiKo.HashTable;

import java.util.HashMap;

/**
 * @author Lenovo
 * @date 2023/2/21
 * @time 19:19
 * @project java_算法
 **/
public class fourSumCount_454_02 {

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count=0;//设置计数器；记录A+B+C+D
        for (int i=0;i< nums1.length;i++){
            for (int j=0;j< nums2.length;j++){
                if (hashMap.containsKey(nums1[i] + nums2[j])){
                    //如果存在A+B；就value+1；
                    hashMap.put(nums1[i]+nums2[j],hashMap.get(nums1[i] + nums2[j])+1);
                }else {
                    hashMap.put(nums1[i]+nums2[j],1);//没有的话直接放入道hashmap中；
                }

            }
        }

        for (int C:nums3) {
            for (int D:nums4) {
                if (hashMap.containsKey(0-(C+D))){//如果hashmap中存在A+B
                    count+=hashMap.get(0-(C+D));//累计计数；
                }
            }
        }
        return count;//返回count
    }
}
