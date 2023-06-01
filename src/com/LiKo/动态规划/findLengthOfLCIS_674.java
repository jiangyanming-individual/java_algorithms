package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/3/30
 * @time 21:42
 * @project java_算法
 **/
public class findLengthOfLCIS_674 {

    public int findLengthOfLCIS(int[] nums){


        int res=1;

        int [] dp=new int[nums.length];
        dp[0]=1;


        for (int i=0;i< nums.length;i++){
            dp[i]=1;
        }

        for (int i=1;i< nums.length;i++){

            if (nums[i]>nums[i-1]){
                dp[i]=dp[i-1]+1;
            }

            if (dp[i]>res){
                res=dp[i];//记录最大的dp[i]
            }
        }

        return res;
    }
}
