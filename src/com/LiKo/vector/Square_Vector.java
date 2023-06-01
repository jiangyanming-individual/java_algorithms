package com.LiKo.vector;

/**
 * @author Lenovo
 * @date 2023/2/2
 * @time 9:55
 * @project java_算法
 **/


/***
 *
 *
 * 数组平方：
 * **/

/***
 *
 *  977题
 * **/
public class Square_Vector {

    //双指针的形式：
    public int[] sortedSquares(int[] nums) {
        int k=nums.length-1;
        int i, j=k;
        //双指针；i指向头，j指向尾部；
        int[] res= new int[nums.length];
        for(i=0; i<=j;)
            if(nums[i] * nums[i]>nums[j] * nums[j]){
                res[k--]=nums[i] * nums[i];
                i++;
            }else{
                res[k--]=nums[j] * nums[j];
                j--;
            }

        return res;
    }

}
