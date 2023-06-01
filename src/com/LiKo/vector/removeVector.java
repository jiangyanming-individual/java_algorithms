package com.LiKo.vector;

/**
 * @author Lenovo
 * @date 2023/2/1
 * @time 22:30
 * @project java_算法
 **/


/***
 *
 *移除数组元素，返回新的数组
 * ***/
public class removeVector {


    //双指针的方法：
//    public int removeElement(int[] nums, int val) {
//
//        int slow=0;
//
//        for (int fast = 0; fast < nums.length ; fast++) {
//            if (nums[fast] !=val){
//                nums[slow]=nums[fast];
//                slow++;
//            }
//        }
//        return slow;
//    }


    //暴力求解的方法：
    public int removeElement(int[] nums, int val) {

        int size= nums.length;

        for (int i=0;i< size;i++){

            if (nums[i] == val){
                for (int j=i+1;j<size;j++){
                    nums[j-1]=nums[j];
                }
                i--;
                size--;
            }
        }
        return size;


//        int size= nums.length;
//        for (int i = 0; i < size; i++) {
//            if(nums[i] == val){
//                for (int j = i+1; j < size ; j++) {//整体元素向前移动；
//                    nums[j-1]=nums[j];
//                }
//                i--; //当前i 的值也要减一；重新遍历；
//                size--; //移动后数组减一；
//            }
//
//        }
//        return size; //记录
    }



}
