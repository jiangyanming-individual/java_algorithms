package com.twice_LiKo.哈希表;

import java.util.HashSet;

/**
 * @author Lenovo
 * @date 2023/4/22
 * @time 8:12
 * @project java_算法
 **/
public class intersection_349 {

    /**
     * 使用hashset可以自己去重复：
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2){

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i=0;i<nums1.length;i++){
            for (int j=0;j<nums2.length;j++){
                if (nums1[i] == nums2[j]){
                    //只加入一个不重复的数：
                    hashSet.add(nums1[i]);
                    break;
                }
            }
        }
        int k=0;
        int[] res = new int[hashSet.size()];
        for (Integer i: hashSet) {
            res[k++]=i;
        }
        return res; //返回结果集
    }
}
