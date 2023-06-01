package com.LiKo.动态规划;

import java.util.Scanner;

/**
 * @author Lenovo
 * @date 2023/3/15
 * @time 10:39
 * @project java_算法
 **/
public class minCostClimbingStairs_746 {

    public static void main(String[] args) {
        int [] cost={10,15,20};
        System.out.println(minCostClimbingStairs(cost));
    }

    public  static int minCostClimbingStairs(int[] cost){

        //确定dp数组 ： 是每到i层楼梯所需要的花费；
        int [] dp =new int[cost.length+1]; //dp数组要比cost多1个 ;index只能取到cost.length
        //确定递推公式：dp[i] =min(dp[i-1] + cost[i-1],dp[i-2] + cost[i-2])

        //初始化：dp[0] =0 ,dp[1]=0;
        dp[0]=0;
        dp[1]=0;
        //遍历顺序是从前往后：
        for (int i=2;i<=cost.length;i++){
            //i是到达第几层：
            dp[i]=Math.min(dp[i-1] +cost[i-1],dp[i-2]+cost[i-2]);
        }

        return dp[cost.length]; //返回最后的一个
    }
}
