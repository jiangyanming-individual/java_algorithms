package com.LiKo.HashTable;

import java.util.HashSet;

/**
 * @author Lenovo
 * @date 2023/2/10
 * @time 17:39
 * @project java_算法
 **/
public class intersection_349 {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> interSet = new HashSet<>();

        for (int i=0;i< nums1.length;i++){

            for (int j=0;j< nums2.length;i++){
                if (nums1[i] == nums2[j]) {
                    interSet.add(nums1[i]);
                    break;
                }
            }
        }
        int [] res= new int[interSet.size()];
        int k=0;
        for (int i :interSet) {
            res[k++]=i;
        }
        return res;
    }
}
