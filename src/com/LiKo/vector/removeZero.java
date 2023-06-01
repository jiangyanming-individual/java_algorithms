package com.LiKo.vector;

/**
 * @author Lenovo
 * @date 2023/2/1
 * @time 23:00
 * @project java_算法
 **/
public class removeZero {

    //双指针：
    public void moveZeroes(int[] nums) {

        int slow =0;
        int fast=0;

        for (fast= 0; fast< nums.length ; fast++) {
            if(nums[fast] !=0){
                nums[slow]= nums[fast];
                slow++;
            }
        }

        for ( int j= slow; j< nums.length;j++){
            nums[j]=0;
        }
    }
}
