package com.LiKo.vector;

/**
 * @author Lenovo
 * @date 2023/2/17
 * @time 22:07
 * @project java_算法
 **/
public class sortedSquares_977 {

    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int i=0,j=nums.length-1;
        int k= nums.length-1;
        while (i<=j){
            if (nums[i] * nums[i]> nums[j] * nums[j]){
                res[k--]=nums[i] * nums[i];
                i++;
            }else {
                res[k--]=nums[j] * nums[j];
                j--;
            }
        }
        return res;
    }
}
