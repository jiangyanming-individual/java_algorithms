package com.twice_LiKo.动态规划;

/**
 * 连续最长递增子序列
 */
public class findLengthOfLCIS_674 {


    public int findLengthOfLCIS(int[] nums){

        int res=1;//至少是有一个长度的子序列；
        //确定dp
        int [] dp=new int[nums.length];
        //初始化dp 全部初始化为1；
        for (int i=0;i<nums.length;i++){
            dp[i]=dp[1];
        }
        for (int i=1;i<nums.length;i++){
            //比较连续的：最长递增子序列：
            if (nums[i]>nums[i-1]){
                dp[i]=dp[i-1]+1;
            }

            if (dp[i]>res){
                res=dp[i];
            }
        }
        return  res;
    }
}
