package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/3/17
 * @time 9:48
 * @project java_算法
 *
 *
 **/

public class integerBreak_343 {


    public int integerBreak(int n){
        //确定dp数组
        int [] dp =new int[n+1];

        //递推公式：dp[i]= max(dp[i],max(j *(i-j),j * dp[i-j]))
        //dp数组初始化：dp[0]=0,dp[1]=0,dp[2]=1;

        dp[0]=0;
        dp[1]=0;
        dp[2]=1;

        //遍历顺序：
        for (int i=3;i<=n;i++){
           // 拆分i这个数
            for (int j=1;i<=i;j++){
                dp[i]=Math.max(dp[i],Math.max(j * (i-j),j *dp[i-j]));
            }
        }

        return dp[n];
    }
}
