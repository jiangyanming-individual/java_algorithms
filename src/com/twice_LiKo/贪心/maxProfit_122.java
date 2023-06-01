package com.twice_LiKo.贪心;

/**
 * @author Lenovo
 * @date 2023/4/7
 * @time 21:51
 * @project java_算法
 **/
public class maxProfit_122 {

//    public int maxProfit(int [] prices){
//
//        //使用低买高卖的策略：
//        int res=0;
//
//        for (int i=1;i<prices.length;i++){
//            res+=Math.max(prices[i]-prices[i-1],0);//如果前高买低卖的话，直接取0
//        }
//
//        return res;
//    }


    //使用动态规划解题
    public int maxProfit(int [] prices){

        //dp[i][0] ：表示第i持有股票 dp[i][1]:表示第i天不持有股票；
        int [][] dp=new int[prices.length][2];
        //dp[i][0]=Max(dp[i-1][0],dp[i-1][1] - prices[i]：表示第i天买入股票)

        //dp[i][1]=Max(dp[i-1][1],dp[i-1][0] +prices[i]：表示第 i天卖了股票)

        //初始化：
        dp[0][0]=-prices[0];//第一天买入股票；

        for (int i=1;i<prices.length;i++){

            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1] -prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0] + prices[i]);
        }
        return dp[prices.length-1][1]; //最后卖出股票获得利益最多；
    }

}
