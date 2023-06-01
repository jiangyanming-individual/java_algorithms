package com.twice_LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/4/6
 * @time 10:52
 * @project java_算法
 **/
public class fib_509 {

    public int fib(int n){

        //特殊情况
        if (n==0) return 0;
        if (n==1) return 1;

        //确定dp
        int [] dp=new int[n+1];

        dp[0]=0;
        dp[1]=1;

        for (int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }

        return dp[n];
    }
}
