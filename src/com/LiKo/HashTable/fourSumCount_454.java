package com.LiKo.HashTable;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Lenovo
 * @date 2023/2/10
 * @time 20:44
 * @project java_算法
 **/
public class fourSumCount_454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        HashMap<Integer, Integer> totalMap = new HashMap<>();
        int count=0;//设置计数器；
        for (int i = 0; i <nums1.length ; i++) {
            for (int j = 0; j <nums2.length ; j++) {
               if (totalMap.containsKey(nums1[i] + nums2[j])){
                   totalMap.put(nums1[i]+nums2[j],totalMap.get(nums1[i]+nums2[j])+1);
               }else {
                   totalMap.put(nums1[i] + nums2[j], 1);
               }
            }
        }

        for (int i:nums3) {
            for (int j:nums4) {
                if (totalMap.containsKey(0-(i+j))){

                    count+=totalMap.get(0-(i+j)); //count进行计数的操作；
                }
            }
        }
        return count;
    }
}
