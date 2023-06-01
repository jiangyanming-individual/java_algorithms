package com.twice_LiKo.动态规划;

public class maxProfit_121 {

    /**
     * 定义股票两个状态：dp[i][0]:第i天持有股票 和 dp[i][1]:第i天不持有股票
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices){

        //dp[i][0]:第i天持有股票 和
        //dp[i][1]:第i天不持有股票

        int[][] dp=new int[prices.length][2];

        //初始化dp
        dp[0][0]=-prices[0]; //第一天买入股票；持有股票；
        dp[0][1]=0;


        //递推公式：
        //初始化dp[i][0]=max(dp[i-1][0],-prices[i]) 第i天买入股票和第i-1天也没有持有股票；
        //dp[i][1]=max(dp[i-1][1],dp[i-1][0] + prices[i]);

        //确定遍历顺序：i从i=1开始；
        for (int i=1;i<prices.length;i++){
            dp[i][0]=Math.max(dp[i-1][0],-prices[i]);//持有股票,只能买卖一次的股票；
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0] + prices[i]); //不持有股票；

        }

        return dp[prices.length-1][1];
    }


    /**
     * 使用贪心算法，找到左边最小的值；右边最大的值；
     * @param prices
     * @return
     */
    public int maxProfit02(int[] prices){

        int low=Integer.MAX_VALUE;
        int res=0;

        for (int i=0;i<prices.length;i++){

            low=Math.min(low,prices[i]); //找到左边最小的值；
            res=Math.max(res,prices[i] - low); //找到左右差距最大的值；
        }

        return res;
    }
}
