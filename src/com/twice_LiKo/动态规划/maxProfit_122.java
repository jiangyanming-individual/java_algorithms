package com.twice_LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/5/16
 * @time 8:13
 * @project java_算法
 **/
public class maxProfit_122 {


    public int maxProfit(int[] prices){


        //确定dp
        int[][] dp=new int[prices.length+1][2];

        //初始化dp
        dp[0][0]=-prices[0];
        dp[0][1]=0;

        //递推公式：第i-1天不持有持有股票，然后第i天买入股票：dp[i][0]=max(dp[i-1][0],dp[i-1][1] - prices[i]);
        //dp[i][1]=max(dp[i-1][1],dp[i-1][0] + prices[i]);

        for (int i=1;i<prices.length;i++){
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1] - prices[i]); //第i天买入股票；
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0] + prices[i]);
        }

        //肯定是卖出股票所得的钱最多
        return dp[prices.length-1][1];
    }
}
