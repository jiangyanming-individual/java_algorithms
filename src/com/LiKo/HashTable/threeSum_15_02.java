package com.LiKo.HashTable;

import com.sun.deploy.config.JREInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/2/21
 * @time 20:10
 * @project java_算法
 **/
public class threeSum_15_02 {

    public List<List<Integer>> threeSum(int[] nums) {

        ArrayList<List<Integer>> resList = new ArrayList<>();

        Arrays.sort(nums); //数组排序；
        for (int i=0;i<nums.length;i++){

            if (nums[i] > 0){
                //如果说第一个数就大于0，直接进行下一轮循环；
                return resList;
            }
            if (i > 0 && nums[i] == nums[i-1])//对a去重；
            {
                continue;
            }
            int left=i+1;
            int right= nums.length-1;

            while (right > left){

                if (nums[i] + nums[left] +nums[right] > 0){
                    right--;
                }else if(nums[i] +nums[left] +nums[right] <0){
                    left++;
                }else {
                    //加入到reslist中；
                    resList.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (right >left && nums[right] == nums[right-1]){
                        right--;
                    }
                    while (right >left && nums[left] == nums[left]){
                        left++;
                    }

                    //找到结果就继续下去。
                    left++;
                    right--;
                }
            }
        }
        return resList;
    }
}
