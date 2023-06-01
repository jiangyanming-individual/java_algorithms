package com.twice_LiKo.动态规划;

public class maxProfit_188 {


    /**跟可以卖出两次的股票是一样的解法
     * 可以买卖多次的股票：
     * @return
     */
    public int maxProfit(int k,int[] prices){

        int[][] dp=new int[prices.length][2 * k +1];//有 2 *k +1个状态；

        //初始化dp
        for (int j=1;j<=2 *k -1;j+=2){
            //奇数全部买入股票；
            dp[0][j]=-prices[0];
        }

        for (int i=1;i<prices.length;i++){
            for (int j=0;j<=2 * k -2;j+=2){
                dp[i][j+1] =Math.max(dp[i-1][j+1],dp[i-1][j] - prices[i]);
                dp[i][j+2] =Math.max(dp[i-1][j+2],dp[i-1][j+1] + prices[i]);
            }
        }

        return dp[prices.length-1][2 *k]; //卖出股票能得到最大的钱
    }
}
