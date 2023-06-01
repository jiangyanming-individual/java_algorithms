package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/3/26
 * @time 20:28
 * @project java_算法
 **/
public class maxProfit_121 {

    public int maxProfit(int[] prices){

        //确定dp数组；dp[i][0]:第i天持有股票的状态，所得的现金； dp[i][1]:第i天不持有股票所的的现金
        int[][] dp=new int[prices.length][2];
        //递推公式；dp[i][0]=max(dp[i-1][0],-prices[i]) 第i-1天也持有股票，和第i天买入股票；
        //dp[i][1]=max(dp[i-1][1],dp[i-1][0]+prices[i]) 第i-1天也不持有股票和 第i-1天持有股票，但是第i天卖了；


        //初始化dp 本金是0
        dp[0][0]=-prices[0];    //第1天持有股票；
        dp[0][1]=0;  //第一天不持有股票；


        //确定dp遍历顺序；
        for (int i=1;i<prices.length;i++){
            dp[i][0]=Math.max(dp[i-1][0],-prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0] + prices[i]);
        }
        //打印dp；
        //返回不持有股票的情况，因为卖出的肯定要比持有的钱多；
        return dp[prices.length-1][1];
    }
}
