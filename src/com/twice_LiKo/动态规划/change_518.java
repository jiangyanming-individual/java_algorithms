package com.twice_LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/5/13
 * @time 9:42
 * @project java_算法
 **/
public class change_518 {

    /**
     * 求组合数，说明是要计算加法，而且元素可以有无限个说明是完全背包的问题
     * @param amount
     * @param coins
     * @return
     */
    public int change(int amount,int[] coins){

        //确定dp
        int[] dp=new int[amount+1];

        //2 初始化dp
        dp[0]=1;
        //递归公式dp[j]+=dp[j-nums[i]]

        for (int i=0;i< coins.length;i++){

            for (int j=coins[i];j<=amount;j++){
                dp[j]+=dp[j- coins[i]];//统计总的方法；
            }
        }
        //返回总的方法数：
        return dp[amount];
    }

}
