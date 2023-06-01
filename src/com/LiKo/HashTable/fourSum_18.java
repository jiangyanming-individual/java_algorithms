package com.LiKo.HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/2/11
 * @time 20:20
 * @project java_算法
 **/
public class fourSum_18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        for (int k=0;k<nums.length;k++){
            if(nums[k]>0 && nums[k]>target){
                return res;
            }
            //a去重复：
            if(k > 0 && nums[k-1]== nums[k]){
                continue;
            }

            for (int i=k+1;i< nums.length;i++){

                if (i>k+1 && nums[i]== nums[i-1]){
                    continue;
                }
                int left=i+1;
                int right=nums.length-1;
                while (right>left){
                    if(nums[k] + nums[i] + nums[left] + nums[right]>target){
                        right--;
                    }else if(nums[k] +nums[i] + nums[left] + nums[right]< target){
                        left++;
                    }else{
                        res.add(Arrays.asList(nums[k],nums[i],nums[left],nums[right]));
                        while (right> left && nums[right] == nums[right-1])
                            right--;
                        while (right> left && nums[left] == nums[left+1])
                            left++;

                        left++;
                        right--;
                    }

                }

            }

        }
        return res;
    }

}
