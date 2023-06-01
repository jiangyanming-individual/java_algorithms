package com.twice_LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/5/13
 * @time 10:00
 * @project java_算法
 **/
public class coinChange_322 {

    public int coinChange(int[] coins,int amount){

        int Max_value=Integer.MAX_VALUE;

        //因为是要求所得到的最小的个数：
        //初始化dp
        int[] dp=new int[amount+1];

        //递推公式：dp[j]=min(dp[j],dp[j-nums[i]] +1);

        //初始化dp
        dp[0]=0;//用一个背包容量为0的需要0个； 其他元素都初始化为，max
        for (int i=1;i<dp.length;i++){
            dp[i]=Max_value;
        }

        //先遍历背包再遍历物品：
        for (int i=1;i<=amount;i++){
            for (int j=0;j<coins.length;j++){

                if (i>=coins[j]){

                    if (dp[i- coins[j]] !=Max_value){
                        //取最小的值：
                        dp[i]=Math.min(dp[i],dp[i-coins[j]] +1);
                    }

                }
            }
        }
        //如果不满足条件返回-1
        if (dp[amount] == Max_value){
            return -1;
        }else {
            return dp[amount];
        }
    }
}
