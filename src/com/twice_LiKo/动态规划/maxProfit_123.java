package com.twice_LiKo.动态规划;

public class maxProfit_123 {


    /**
     * 设置5个状态：dp[0-4]
     *
     *dp[0]:没有操作：
     * dp[1]:第一次买入：
     * dp[2]:第一次卖出
     * dp[3]:第二次买入：
     * dp[4]:第二次卖出
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices){

        int [][] dp=new int[prices.length+1][5];

        //初始化dp
        dp[0][0]=0;
        dp[0][1]=-prices[0]; //第一次买入
        dp[0][2]=0;
        dp[0][3]=-prices[0]; //第二次买入
        dp[0][4]=0;

        //递归公式：
        /**
         * dp[i][1]=max(dp[i-1][1],dp[i-1][0] - prices[i])
         * dp[i][2]=max(dp[i-1][2],dp[i-1][1] +prices[i])
         * dp[i][3]=max(dp[i-1][3],dp[i-1][2] -prices[i])
         * dp[i][4]=max(dp]i-1][4],dp[i-1][3] +prices[i])
         */

        for (int i=1;i<prices.length;i++){
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0] - prices[i]);
            dp[i][2]=Math.max(dp[i-1][2],dp[i-1][1] +prices[i]);
            dp[i][3]=Math.max(dp[i-1][3],dp[i-1][2] - prices[i]);
            dp[i][4]=Math.max(dp[i-1][4],dp[i-1][3] +prices[i]);
        }

        return dp[prices.length-1][4];
    }
}
