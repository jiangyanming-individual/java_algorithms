package com.LiKo.HashTable;

import com.LiKo.List.ListNode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/2/11
 * @time 17:19
 * @project java_算法
 **/
public class threeSum_15 {

    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);//数组排序；

        for (int i=0;i<nums.length;i++){
            if (nums[i]>0)//第一个i>0直接下一轮循环；
                continue;

            if(i>0 && nums[i]== nums[i-1])//a去重；
                continue;
            int left=i+1;
            int right=nums.length-1;

            while (right>left){

                if(nums[i]+nums[left]+nums[right] >0){
                    right--;
                }else if(nums[i] +nums[left] +nums[right]<0){
                    left++;
                }else{
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (right>left && nums[right]==nums[right--]){
                        right--;
                    }
                    while (right>left && nums[left] == nums[left+1]){
                        left++;
                    }
                }
                //去重
            }
        }
        return res;
    }
}
