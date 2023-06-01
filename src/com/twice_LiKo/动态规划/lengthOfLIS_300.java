package com.twice_LiKo.动态规划;
/**
 * @author Lenovo
 * @date 2023/5/18
 * @time 8:40
 * @project java_算法
 **/
public class lengthOfLIS_300 {

    public int lengthOfLIS(int[] nums){
        int res=Integer.MIN_VALUE;

        //dp[i] 表示以num[i]结尾的最长递增子序列的长度：
        int[] dp=new int[nums.length];

        //初始化dp
        for (int i=0;i<nums.length;i++){
            dp[i]=1;//最小的长度也是1；
        }

        //递推公式：dp[i]=max(dp[i],dp[j]+1);
        //比较两个子序列
        for (int i=0;i<nums.length;i++){

            for (int j=0;j<i;j++){
                //j<=i-1
                if (nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            //比较最大的结果保存下来：
            if (dp[i] >res){
                res=dp[i];
            }
        }
        return res;
    }
}
