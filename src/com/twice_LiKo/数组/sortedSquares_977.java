package com.twice_LiKo.数组;

/**
 * 双指针的思想
 */
public class sortedSquares_977 {


    public int[] sortedSquares(int[] nums){
        //定义一个新的数组来存放数的平方；
        int [] res=new int[nums.length];

        int left=0;
        int right= nums.length-1;
        int index= nums.length-1;
        //左闭右闭的区间；
        while (left<=right){
            if (nums[left] * nums[left] >nums[right] * nums[right]){
                res[index--]=nums[left] * nums[left];
            }else {
                res[index--]=nums[right] * nums[right];
            }
        }

        return res;
    }
}
