package com.LiKo.贪心;

import java.util.Arrays;

/**
 * @author Lenovo
 * @date 2023/3/10
 * @time 11:36
 * @project java_算法
 **/
public class largestSumAfterKNegations_1005 {


    public int largestSumAfterKNegations(int[] nums,int k){
        int temp;
        //根据数值的绝对值进行降序排序；使用冒泡排序：
        for(int i=0;i< nums.length-1;i++){

            //n-1层排序：
            for (int j=0;j< nums.length-1-i;j++){
                if (Math.abs(nums[j]) < Math.abs(nums[j+1])){
                    //进行交换：
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        int res=0;
        for (int i= 0;i< nums.length;i++){

            if (nums[i]<0 && k>0){
                //对最大的负数进行取反操作：
                nums[i]=nums[i] * -1;
                k-=1;
            }
        }
        if (k % 2!=0){
            //k为奇数的话 ，最小的数进行取反操作：
            nums[nums.length-1]=nums[nums.length-1] * -1;
        }

        for (int i=0; i< nums.length;i++){
            //进行统计和的操作：
            res+= nums[i];
        }
        return res;

    }
}
