package com.LiKo.HashTable;

import java.util.HashSet;

/**
 * @author Lenovo
 * @date 2023/2/20
 * @time 18:18
 * @project java_算法
 **/
public class intersection_349_02 {

    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i=0;i<nums1.length;i++){
            
            for (int j=0;j< nums2.length;j++){
                if (nums1[i] == nums2[j]){
                    hashSet.add(nums1[i]);
                    break;//只加入一个就好了，hashset有去重复的能力
                }
            }
        }
        
        //因为返回的数组，所以要new一个新的数组
        int [] res=new int[hashSet.size()];
        int k=0;
        for (Integer i : hashSet) {//遍历hashset
            res[k++]=i;
        }
        return res;
    }
}
