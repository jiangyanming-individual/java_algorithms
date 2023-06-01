package com.twice_LiKo.数组;

/**
 * 使用双指针的操作：
 */
public class removeElement_27 {

    public int removeElement(int[] nums,int val){

        int slowIndex=0;
        for (int fastIndex=0;fastIndex<nums.length;fastIndex++){
            //如果等于目标值，fast移动,slowIndex不动；
            if (nums[fastIndex]!=val){
                nums[slowIndex]=nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }
}
