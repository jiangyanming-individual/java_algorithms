package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/3/15
 * @time 10:12
 * @project java_算法
 **/
public class climbStairs_70 {


    public int climbStairs(int n){

        if ( n <= 2){
            //只有一种情况；
            return n;
        }
        //确定dp数组
        int [] dp=new int[n];

        //确定递推公式 dp[i]=dp[i-1] + dp[i-2]
        //初始化dp
        dp[1]=1;
        dp[2]=2;

        //确定dp的遍历顺序；
        for (int i=3;i<=n;i++){
            dp[i]=dp[i-1] + dp[i-2];
        }
        return dp[n];
        //返回结果；
    }
}
