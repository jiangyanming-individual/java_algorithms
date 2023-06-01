package com.twice_LiKo.动态规划;


/**
 * 完全平方数： 如果求排列数就先遍历背包再遍历物品
 */
public class numSquares_279 {

    public int numSquares(int n){

        int Max_value=Integer.MAX_VALUE;

        //确定dp 为n时所需要的最小完全平方数的数量
        int [] dp=new int[n+1];//

        //递归公式：dp[j] =min(dp[j],dp[j -i*i]+1)

        //初始化dp
        dp[0]=0;
        for (int i=1;i<dp.length;i++){
            dp[i]=Max_value;
        }

        //先遍历物品再遍历背包：
        for (int i=0;i * i <=n;i++){
            //背包的第一个容量一定是 i * i
            for (int j=i * i;j<=n;j++){
                if (dp[j - i*i]!=Max_value){
                    dp[j]=Math.min(dp[j],dp[j- i * i]+1);
                }

            }
        }
        return dp[n];
    }
}
