package com.LiKo.动态规划;

import org.omg.CORBA.INTERNAL;

/**
 * @author Lenovo
 * @date 2023/3/23
 * @time 8:36
 * @project java_算法
 **/
public class numSquares_279 {

    /****
     *
     * 给你一个整数 n ，返回 和为 n 的完全平方数的最少数量 。
     * 完全平方数 是一个整数，其值等于另一个整数的平方；
     * 换句话说，其值等于一个整数自乘的积。例如，1、4、9 和 16 都是完全平方数，
     * 而 3 和 11 不是。
     *
     *
     * ***/
    public int numSquares(int n){

        //确定dp数组： dp[i]是最少的完全平方数；
        int [] dp=new int[n+1];
        // 递推公式：dp[j]=min(dp[j -i * i]+1,dp[j]) dp[j]是不放i这个数

        //初始化dp dp[0]=0; 其他的dp都是Max;
        int max= Integer.MAX_VALUE;
        dp[0]=0;
        for (int i=1;i<dp.length;i++){
            dp[i]=max;
        }

        //先遍历物品：
        for (int i=0;i * i<=n;i++){

            //遍历背包：第一个背包的容量必须是i * i
            for (int j= i * i;j<=n;j++){
                if (dp[j- i*i] !=max){
                    dp[j]=Math.min(dp[j],dp[j-i *i]+1);
                }
            }
        }


        return  dp[n];
    }
}
