package com.twice_LiKo.动态规划;


/**
 *  * 四种情况：
 * 0:持有股票 dp[i][0]=max(dp[i-1][0],dp[i-1][3] - prices[i],dp[i-1][1] -prices[i])
 * 1.一直持有股票；2.昨天是冷冻期，然后今天买入股票；3.一直处于卖股票的状态，而且冷冻期过了,然后今天买入股票；
 * 1:处于卖出股票的状态 :dp[i][1]=max(dp[i-1][1],dp[i-1][3]) (1.一直处于卖股票的状态，2.前天刚卖出股票，昨天是冷冻期；）
 * 2:今天卖出股票：dp[i][2]=dp[i-1][0] +prices[i];
 * 3:处于冷冻期 :dp[i][3]=dp[i-1][2]; 昨天卖出股票
 */
public class maxProfit_309 {

    public int maxProfit(int[] prices){

        int [][] dp=new int[prices.length][4];

        //递推公式：

        //初始化dp
        dp[0][0]=-prices[0];
        dp[0][1]=0;
        dp[0][2]=0;
        dp[0][3]=0;

        for (int i=1;i<prices.length;i++){
            dp[i][0]=Math.max(dp[i-1][0],Math.max(dp[i-1][3] -prices[i],dp[i-1][1]  -prices[i]));
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][3]);//前天卖了股票’
            dp[i][2]=dp[i-1][0] + prices[i];//今天卖出股票；
            dp[i][3]=dp[i-1][2]; //昨天卖出股票；今天处于冷冻期；
        }
        //比较处于冷冻期、处于卖出股票的状态、今天卖出股票这三个情况中的最大值；
        return Math.max(dp[prices.length-1][1],Math.max(dp[prices.length-1][2],dp[prices.length-1][3]));
    }
}
