package com.twice_LiKo.哈希表;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/4/25
 * @time 9:18
 * @project java_算法
 **/
public class threeSum_15 {

    /**
     * 有一个a b c s三个数去重复的过程：
     * @param nums
     * @return
     */

    public List<List<Integer>> thressSum(int[] nums){

        //用于保存结果：
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            if (nums[i]>0){
                //如果排完序的第一个数就已经大于0了，就直接返回
                return res;
            }

            //对a去重的过程：
            if (i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=nums.length-1;
            while (left<right){

                if (nums[i]+nums[left]+nums[right]>0){
                    right--;
                }else if (nums[i]+nums[left]+nums[right]<0){
                    left++;
                }else{

                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    //对 b c去重的过程：
                    while (left<right && nums[right] == nums[right-1]){
                        right--;
                    }
                    while (left<right && nums[left] ==nums[left+1]){
                        left++;
                    }
                    //如果没有重复的，就继续下去：
                    left++;
                    right--;
                }
            }

        }
        return res;
    }
}
