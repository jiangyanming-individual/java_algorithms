package com.twice_LiKo.哈希表;

import java.util.HashMap;

/**
 * @author Lenovo
 * @date 2023/4/23
 * @time 19:19
 * @project java_算法
 **/
public class fourSumCount_454 {

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        //a +b +c +d=0
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i=0;i<nums1.length;i++){

            for (int j=0;j<nums2.length;j++){
                if (hashMap.containsKey(nums1[i]+nums2[j])){
                    hashMap.put(nums1[i]+nums2[j],hashMap.get(nums1[i]+nums2[j])+1);
                }else{
                    hashMap.put(nums1[i]+nums2[j],1);//反之设置为1
                }
            }
        }

        int count=0;

        for (Integer c:nums3) {
            for (Integer d:nums4) {
                if (hashMap.containsKey(0-(c+d))){ //如果hashmap中存在a +b
                    count+=hashMap.get(0-(c+d)); //进行统计 个数；
                }
            }
        }

        return count;
    }
}
