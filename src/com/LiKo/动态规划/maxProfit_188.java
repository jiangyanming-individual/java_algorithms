package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/3/28
 * @time 21:41
 * @project java_算法
 **/
public class maxProfit_188 {

    public int maxProfit(int k ,int[] prices){

        //确定dp
        int [][] dp=new int[prices.length][2*k + 1]; //只能取到2 *k

        //确定递推公式
        //dp[i][j+1]=max(dp[i-1][j+1],dp[i-1][j]-prices[i])
        //dp[i][j+2]=max(dp[i-1][j+1],dp[i][j+1]+prices[i])

        //初始化dp dp[i]=-prices[i] ; i是奇数就是买入， i是偶数就0；
        for (int j=1;j< 2 * k;j+=2){
            dp[0][j]=-prices[0];
        }

        for (int i=0;i<prices.length;i++){

            for (int j=0;j< 2 * k -1;j+=2){//减去后两个数，防止越界；

                dp[i][j+1]=Math.max(dp[i-1][j+1],dp[i-1][j]-prices[i]);
                dp[i][j+2]=Math.max(dp[i-1][j+2],dp[i-1][j+1] +prices[i]);
            }
        }
        return dp[prices.length-1][2*k]; //返回卖出股票时的最大金额；
    }
}
