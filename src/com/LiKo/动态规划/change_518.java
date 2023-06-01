package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/3/22
 * @time 9:00
 * @project java_算法
 **/
public class change_518 {

    public static void main(String[] args) {
        int [] coins={1,2,5};
        int amount=5;
        change(amount,coins);
    }
    public static int change(int amount,int[] coins){

        //确定dp
        int [] dp=new int[amount+1];
        //递推公式：dp[j]+=dp[j-weight[i]]
        //初始化dp[0]=1
        dp[0]=1;
        //遍历顺序：
        for (int i=0;i<coins.length;i++){
            for (int j=coins[i];j<=amount;j++){

                dp[j]+=dp[j-coins[i]];
            }
        }

        for (int i=0;i<=amount;i++){
            System.out.print(dp[i]+" ");
        }

        return dp[amount];
    }
}
