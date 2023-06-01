package com.twice_LiKo.数组;

/**
 * 双指针的思想： 滑动窗口：
 */
public class minSubArrayLen_209 {

    public int minSubArrayLen(int taget,int[] nums){

        int start=0;
        //将result设置为最大的值：
        int result=Integer.MAX_VALUE;
        int sum=0;

        for (int end=0;end<nums.length;end++){
            sum+=nums[end];

            //while 一直将start的值进行变化：
            while (sum>=taget){
                //数组长度，因为从0开始的；
                int subLength=end -start +1;
                result=result < subLength ? result:subLength;
                sum-=nums[start++]; //将start前移动1位；
            }
        }
        return result == Integer.MAX_VALUE ? 0: result;
    }
}
