package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/3/30
 * @time 21:25
 * @project java_算法
 **/
public class lengthOfLIS_300 {


    public int lengthOfLIS(int [] nums){

        int res=0;
        int[] dp=new int[nums.length];

        for (int i=0;i<nums.length;i++){
            dp[i]=1;
        }


        for (int i=0;i<nums.length;i++){

            for (int j=0;j<i;j++){
                if (nums[i] >nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            if(dp[i] >res) res=dp[i]; //取最长的子序列；
        }
        return res;
    }
}
