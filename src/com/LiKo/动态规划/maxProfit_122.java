package com.LiKo.动态规划;/**
    *@author Lenovo
    *@date 2023/3/26
    *@time 21:20
    *@project java_算法
**/

public class maxProfit_122 {

    public int maxProfit(int[] prices){

        //确定dp数组：
        int [][] dp=new int[prices.length][2];

        //递推公式dp[i][0]:第i天持有股票的情况= 第i-1天也持有股票和第i-1天不持有股票的金额-第i天买入股票；
        // dp[i][0]=max(dp[i-1][0],dp[i-1][1]-prices[i])
        //dp[i][1] :第i天不持有股票的情况：第i-1天也不持有股票和 第i-1天持有股票，但是第i天卖了
        //dp[i][1] =max(dp[i-1][1],dp[i-1][0] + prices[i])


        //初始化dp dp[0][0] =-prices[0] ,dp[0][1]=0;
        dp[0][0]=-prices[0]; //买入股票；
        dp[0][1]=0;

        for (int i=1;i<prices.length;i++){
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1] - prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]+ prices[i]);
        }
        return dp[prices.length-1][0]; //，卖出股票的收益比较高；

    }
}
