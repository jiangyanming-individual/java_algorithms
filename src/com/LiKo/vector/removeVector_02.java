package com.LiKo.vector;

/**
 * @author Lenovo
 * @date 2023/2/15
 * @time 13:32
 * @project java_算法
 **/
public class removeVector_02 {

    //使用快慢指针的思想
    public int removeElement(int[] nums, int val) {

        int size=nums.length;
        int fast=0,slow=0;

        for (fast=0;fast< nums.length;fast++){

            if (nums[fast] !=val){
                nums[slow]=nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
