package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/3/15
 * @time 9:56
 * @project java_算法
 **/
public class fib_509 {

    public int fib(int n){

        //确定特殊的情况
        if (n == 0){
            return 0;
        }

        if (n == 1){
            return 1;
        }

        //确定数组：dp
        int[] dp=new int[n+1]; // 数组的长度是n+1

        //递推公式dp[i] = dp[i-1] + dp[i-2]
        //初始化dp ,dp[0]=0,dp[1]=1
        dp[0]=0;
        dp[1]=1;
        //从前往后去遍历数组：第一个index应该是从2开始
        for (int i=2;i<=n;i++){
            //  i 可以取到 n
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

}
