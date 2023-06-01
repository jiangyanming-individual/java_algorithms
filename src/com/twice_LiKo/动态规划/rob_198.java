package com.twice_LiKo.动态规划;


/**
 * 打家劫舍的问题：
 */
public class rob_198 {


    public int rob(int[] nums){

        //dp 是考虑 i以内的房屋下，能偷的最多金额
        int [] dp=new int[nums.length+1];
        //递推公式 ：dp[i]=max(dp[i-1],dp[i-2] + num[i]) =>第i个房屋不偷，和第i个房屋偷，但是i-1个房屋肯定不能偷；

        if (nums.length == 1){
            return nums[0];
        }
        //初始化dp
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]); //dp[1]要取前两个数中最大的数：


        //下标index 从i=2开始
        for (int i=2;i<nums.length;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2] + nums[i]);
        }

        return dp[nums.length-1]; //房屋下标从0开始
    }
}
