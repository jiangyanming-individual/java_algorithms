package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/3/29
 * @time 21:41
 * @project java_算法
 **/
public class maxProfit_309 {


    public int maxProfit(int[] prices){


        //确定dp dp[i][j]
        //四种状态； dp[i][0]:持有股票的状态
        // dp[i][1]：保持卖出股票的状态
        // dp[i][2]：今天卖出股票的状态
        //dp[i][3]: 冷冻期的状态；


        int[][] dp=new int[prices.length][4];

        //确定递推公式
        //dp[i][0]=max(dp[i-1][0],dp[i-1][3]-prices[i]：前一天冷冻期，然后今天买股票；,dp[i-1][1] - prices[i]:前一天保持卖股票的状态；今天买出股票)
        //dp[i][1] =max(dp[i-1][1] 一直保持的是卖出股票的状态,dp[i-1][3]：前天卖出股票，昨天是冷冻期)

        //dp[i][2]=dp[i-1][0] +prices[i] :昨天买，今天卖；
        //dp[i][3]=dp[i-1][2]//昨天是处于卖出股票
        //初始化dp
        dp[0][0]=-prices[0];
        dp[0][1]=0;
        dp[0][2]=0;
        dp[0][3]=0;

        //确定遍历顺序；

        for (int i=1;i<prices.length;i++){

            dp[i][0]=Math.max(Math.max(dp[i-1][0],dp[i-1][3] -prices[i]),dp[i-1][1]-prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][3]);
            dp[i][2]=dp[i-1][0] + prices[i]; //当前卖出股票
            dp[i][3]=dp[i-1][2]; //前天卖股票，然后进入冷冻期；
        }

        //返回状态一 状态二 ，状态三中最大的一个值
        return Math.max(Math.max(dp[prices.length-1][1],dp[prices.length-1][2]),dp[prices.length-1][3]);
    }
}
