package com.twice_LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/4/8
 * @time 9:29
 * @project java_算法
 **/
public class integerBreak_343 {

    public int integerBreak(int n){

        //确定dp dp[i]是正整数n所能取的最大乘积；
        int[] dp=new int[n+1];
        //递推公式：dp[i] =max(dp[i],max(dp[i-j]*j ,(i-j)*j))

        //初始化dp[2]=1;//因为2 的最大乘积是1；
        dp[2]=1;

        for (int i=3;i<=n;i++){
            for (int j=1;j<=i/2;j++){
                //j<= i/2 是需要i和尽量相同；
                dp[i]=Math.max(dp[i],Math.max(dp[i-j] * j,(i-j)*j));
            }
        }
        return dp[n];//返回dp[n]表示所能得到的最大的拆分乘积；
    }
}
