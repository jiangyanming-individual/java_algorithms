package com.LiKo.HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/2/21
 * @time 20:57
 * @project java_算法
 **/
public class fourSum_18_02 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> resList = new ArrayList<>();
        Arrays.sort(nums);
        for (int k=0;k<nums.length;k++){

            if (nums[k] > 0 && nums[k]>target){
                return resList;
            }
            //对a去重
            if (k>0 && nums[k] == nums[k-1]){
                continue;
            }

            for (int i=k+1;i<nums.length;i++){
                //对b去重
                if (i>k+1 && nums[i] == nums[i-1]){
                    continue;
                }

                int left=i+1;
                int right=nums.length-1;

                while (right>left){

                    if (nums[k] + nums[i] +nums[left] +nums[right] >target){
                        right--;
                    }else if (nums[k] + nums[i] +nums[left] +nums[right] <target){
                        left++;
                    }else {
                        resList.add(Arrays.asList(nums[k],nums[i],nums[left],nums[right]));
                        //对c,d去重
                        while (right > left && nums[right] == nums[right-1]){
                            right--;
                        }
                        while(right >left && nums[left] == nums[left+1]){
                            left++;
                        }

                        //如果没有重复，就继续left++ ,right--;
                        left++;
                        right--;
                    }


                }
            }

        }
        return resList;
    }
}
