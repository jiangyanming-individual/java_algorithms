package com.LiKo.vector;

/**
 * @author Lenovo
 * @date 2023/2/1
 * @time 21:45
 * @project java_算法
 **/



/****
 *
 * 二分查找法；
 * ***/
public class twosplit_search {


    //[left,right]
//    public int search_704(int[] nums, int target) {
//        int left=0,right= nums.length-1;
//
//        while (left<=right){
//            int middle=left + (right-left)/2;
//            if(nums[middle] > target){
//                right=middle-1;
//            }else if (nums[middle]<target){
//                left=middle+ 1;
//            }else{
//                return middle;
//            }
//
//
//        }
//        return -1;
//    }


    //[left,right)
    public int search(int[] nums, int target) {

        int left=0,right= nums.length;
        while (left < right){
            int middle= left + (right -left)/2;
            if(nums[middle] > target){
                right=middle;//取不到middle；
            }else if (nums[middle] < target){
                left=middle + 1;
            }else{
                return middle;
            }
        }

       return -1;
    }
}
