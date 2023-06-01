package com.twice_LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/5/11
 * @time 10:31
 * @project java_算法
 **/
public class lastStoneWeightII_1049 {

    public int lastStoneWeightII(int [] stones){

        int sum=0;
        for (int i=0;i<stones.length;i++){
            sum+=stones[i];
        }
        int target=sum / 2;

        //初始化dp
        int[] dp=new int[target+1];
        for (int i=0;i<stones.length;i++){
            for (int j=target;j>=stones[i];j--){
                dp[j]=Math.max(dp[j],dp[j-stones[i]] + stones[i]);
            }
        }
        //返回最小的重量；
        return (sum - dp[target]) - dp[target];
    }
}
