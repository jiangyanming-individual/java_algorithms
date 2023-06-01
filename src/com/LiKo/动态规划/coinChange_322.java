package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/3/22
 * @time 9:54
 * @project java_算法
 **/
public class coinChange_322 {

    public int coinChange(int [] coins,int amount){

        //确定dp数组，dp[i]是凑成总数为amount金额需要多少个元素；
        int [] dp=new int[amount+1];

        //递推公式 dp[j]=min(dp[j],dp[j-coins[i]] +1);
        int max=Integer.MAX_VALUE;
        dp[0]=0;
        //初始化 dp[0]=0; 其他得都为Max;
        for (int i=1;i<dp.length;i++){
            dp[i]=max;
        }

        //遍历顺序；先遍历物品再遍历背包都可以；
        for (int i=0;i<coins.length;i++){

            for (int j=coins[i];j<=amount;j++){
                if(dp[j-coins[i]] !=max){
                    //如果当前dp[j-coins[i]] 是初始的值，就直接跳过
                    dp[j]=Math.min(dp[j],dp[j-coins[i]]+1);
                }
            }
        }


        if (dp[amount] == Integer.MAX_VALUE){
            return -1;
        }
        return dp[amount];
    }
}
