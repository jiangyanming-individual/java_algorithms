package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/3/30
 * @time 21:13
 * @project java_算法
 **/
public class maxProfit_714 {


    public int maxProfit(int [] prices,int fee) {

        //确定dp
        int[][] dp=new int[prices.length][2];

        //确定递归公式；
        //dp[i][0] =max(dp[i-1][0],dp[i-1][1] - prices[i]) 持有股票
        //dp[i][1]=max(dp[i-1][1],dp[i-1][0] + prcies[i] -fee);不持有股票的状态

        //初始化dp

        dp[0][0]=-prices[0];
        dp[0][1]=0;
        //确定遍历顺序：
        for (int i=1;i<prices.length;i++){
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1] -prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0] + prices[i]- fee);
        }
        return dp[prices.length-1][1];
    }
}
