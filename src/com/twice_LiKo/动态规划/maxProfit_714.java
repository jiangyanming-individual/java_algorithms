package com.twice_LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/5/18
 * @time 8:27
 * @project java_算法
 **/
public class maxProfit_714 {

    public int maxProfit(int [] prices,int fee) {

        //确定dp dp[i][0]表示持有股票；dp[i][1]：卖出股票
        int[][] dp=new int[prices.length][2];

        //递归公式：
        // dp[i][0]=max(dp[i-1][0],dp[i-1][1] -prices[i])
        //dp[i][1]=max(dp[i-1][1],dp[i-1][0] +prices[i] -fee);

        //初始化dp
        dp[0][0]=-prices[0];
        dp[0][1]=0;

        for (int i=1;i< prices.length;i++){
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1] - prices[i]);
            //卖出股票需要减去手续费用；
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0] +prices[i] -fee);
        }

        return dp[prices.length-1][1];
    }
}
