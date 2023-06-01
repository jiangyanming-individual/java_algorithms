package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/4/1
 * @time 10:01
 * @project java_算法
 **/
public class maxSubArray_53 {


    public int maxSubArray(int[] nums){

        int res=0;

        //dp是 nums[i]的最大元素之和
        int [] dp=new int[nums.length];

        //nums[i]是从头开始

        //递推公式：dp[i] =max(dp[i-1]+nums[i],nums[i])

        //初始化
        dp[0]=nums[0];
        for (int i=1;i< nums.length;i++){
            dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
            if (dp[i]>res){
                res=dp[i];
            }
        }
        return res;
    }
}
