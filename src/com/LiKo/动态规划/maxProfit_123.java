package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/3/28
 * @time 21:08
 * @project java_算法
 **/
public class maxProfit_123 {



    //可以买卖两次股票：
    public int maxProfit(int[] prices){

        //确定dp ,dp[i][j] j表示买卖股票的几种状态；
        if(prices.length == 0) return 0;
        int[][] dp=new int[prices.length][5];

        /***
         * 0:无操作：
         * 1：第一次买入；
         * 2 ：第一次卖出；
         * 3：第二次买入；
         * 4：第二次卖出
         * **/
        //递推公式；
        //dp[i][1]=max(dp[i-1][1],dp[i-1][0] -prices[i])
        //dp[i][2]=max(dp[i-1][2],dp[i-1][1] + prices[i]
        // dp[i][3]=max(dp[i-1][3],dp[i-1] -prices[i])
        // dp[i][4]=max(dp[i-1][4],dp[i-1][3] + prices[i])


        //初始化dp dp[0][0]=0, dp[0][1]=-prices[0] dp[0][2] =0 因为还没有买入，
        //dp[0][3]=-prices[0]  dp[0][4]=0 没有买入也没有卖出：
        dp[0][0]=0;
        dp[0][1]=-prices[0];
        dp[0][2]=0;
        dp[0][3]=-prices[0];
        dp[0][4]=0;


        //确定遍历顺序：从前往后去遍历：
        for (int i=1;i<prices.length;i++){

            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0] - prices[i]);//第一次买股票；
            dp[i][2]=Math.max(dp[i-1][2],dp[i-1][1] + prices[i]);
            dp[i][3]=Math.max(dp[i-1][3],dp[i-1][2] - prices[i]);//第二次买股票；
            dp[i][4]=Math.max(dp[i-1][4],dp[i-1][3] +prices[i]);
        }

        return dp[prices.length-1][4];
    }
}
