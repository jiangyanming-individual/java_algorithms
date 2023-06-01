package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/3/22
 * @time 9:09
 * @project java_算法
 **/
public class test_完全背包问题 {
    public static void main(String[] args) {
        int[] weight = {1, 3, 4};
        int[] value = {15, 20, 30};
        int bagWeight = 4;


        //定义dp数组：
        int [] dp=new int [bagWeight+1];
        //确定推导公式：dp[j]=max(dp[j],dp[j-weight[i]] + value[i])
        //初始化dp dp[i]=0;

        //确定遍历顺序：
        //先遍历物品：
        for (int i=0;i<weight.length;i++){
            //再遍历正序背包：
            for (int j=weight[i];j<=bagWeight;j++){
                dp[j]=Math.max(dp[j],dp[j-weight[i]] + value[i]);
            }
        }
        //打印dp
        for (int i=0;i<dp.length;i++){
            System.out.print(dp[i]+",");
        }
    }
}
