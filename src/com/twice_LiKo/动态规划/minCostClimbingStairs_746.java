package com.twice_LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/4/6
 * @time 11:01
 * @project java_算法
 **/
public class minCostClimbingStairs_746 {


    public int minCostClimbingStairs(int[] cost){

        //确定dp dp[i]表示到达第i层最小的花费；
        int [] dp=new int[cost.length+1];

        //递推公式：dp[i]=min(dp[i-1]+cost[i],dp[i-2]+cost[i])

        //初始化dp[0]=0;dp[1]=1;因为i第0层和第1层不需要花费
        dp[0]=0;
        dp[1]=0;
        for (int i=2;i<cost.length;i++){
            //dp[i-1]+当前的花费： dp[i-2]+当前的花费：
            dp[i]=Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }

        return dp[cost.length];

    }
}
