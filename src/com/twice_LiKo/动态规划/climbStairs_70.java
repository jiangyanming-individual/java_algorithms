package com.twice_LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/4/6
 * @time 10:57
 * @project java_算法
 **/
public class climbStairs_70 {

    public int climbStairs(int n){
        if (n==1)return 1;
        if (n==2)return 2;


        //确定dp数组；
        int [] dp=new int[n+1];

        dp[1]=1;
        dp[2]=2;
        //i 从3开始 每次跳一层或者两层；
        for (int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
