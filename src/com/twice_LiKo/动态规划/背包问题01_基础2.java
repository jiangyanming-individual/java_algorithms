package com.twice_LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/4/15
 * @time 10:11
 * @project java_算法
 **/
public class 背包问题01_基础2 {

    public static void main(String[] args) {
        int[] weight = {1, 3, 4};
        int[] value = {15, 20, 30};
        int bagWight = 4;
        testWeightBagProblem(weight, value, bagWight);
    }

    //使用一维的dp数组
    public static void testWeightBagProblem(int [] weight,int[] value,int bagWight){

        //dp[j] ：表示使用背包容量为j 所能容纳的最大价值
        int dp[]=new int[bagWight+1];

        //确定dp公式： dp[j]=Math.max(dp[j],dp[j-weight[i]] +value[i])

        //初始dp全部都是0   dp[i]=0

        //确定遍历顺序：先遍历物品再遍历背包：
        for (int i=0;i< weight.length;i++){

            for (int j=bagWight;j>=weight[i];j--){
                //不加入第i个物品，和加入第i个物品所能取得最大价值。
                dp[j]=Math.max(dp[j],dp[j- weight[i]]+ value[i]);
                System.out.println(dp[j]);
            }
        }

//        //        打印dp数组：
//        for (int i=0;i<=bagWight;i++){
//            System.out.print(dp[i]+" ");
//        }


    }
}
