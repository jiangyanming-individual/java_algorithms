package com.twice_LiKo.动态规划;


/**
 * 最大子数组的和
 */
public class maxSubArray_53 {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0){
            return 0;
        }

        int res=nums[0];//最终的结果
        //确定dp
        int[] dp=new int[nums.length];
        //确定递推公式：dp[i]=max(dp[i-1]+nums[i],nums[i]);nums[i]从头开始；

        //初始化dp dp[0]=nums[0]
        dp[0]=nums[0];

        for (int i=1;i<nums.length;i++){
            dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);

            if (dp[i]>res){
                res=dp[i];
            }
        }
        return res;
    }
}