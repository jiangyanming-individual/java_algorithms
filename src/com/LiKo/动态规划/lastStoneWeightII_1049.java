package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/3/20
 * @time 10:03
 * @project java_算法
 **/
public class lastStoneWeightII_1049 {

    public int lastStoneWeightII(int [] stones){
        int sum=0;
        for (int i=0;i<stones[i];i++){
            sum+=stones[i];
        }
        //将石头分成两拨 重量相等的
        int target=sum/2;

        //确定dp
        int [] dp=new int[target+1]; //多加一个元素的位置；
        //推导dp数组 dp[j]=max(dp[j],dp[j-stones[i]] + stones[i])

        //初始化dp
        for (int i=0;i<stones.length;i++){

            for (int j=target;j>=stones[i];j--){
                dp[j]=Math.max(dp[j],dp[j-stones[i]]+stones[i]);
            }
        }
        return (sum-dp[target]) -dp[target]; //两个石头进行相减的操作；
    }
}
