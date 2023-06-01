package com.twice_LiKo.数组;

/**
 * 二分法，左闭右闭的区间
 */
public class search_704 {

    public int search(int[] nums ,int target){

        int left=0,right=nums.length-1;

        while (left<=right){

            int mid=left + (right -left) / 2;

            if (nums[mid]>target){
                right=mid-1;
            }else if (nums[mid]<target){
                left=mid+1;
            }else {
                return mid;
            }
        }

        //不存在返回-1；
        return -1;
    }
}
