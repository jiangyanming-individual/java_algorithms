package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/3/16
 * @time 18:53
 * @project java_算法
 **/
public class uniquePaths_62 {
    public int uniquePaths(int m, int n) {
        //新建一个二维数组：
        int [][] dp=new int[m][n];
        //dp数组，二维数组：

        //初始化dp数组：dp[0][j]=1 ;dp[j][0]=1
        for (int i=0;i<m;i++){
            dp[i][0]=1;
        }
        for (int j=0;j<n;j++){
            dp[0][j]=1;
        }

        //递推公式 dp[i][j]=dp[i-1][j]+dp[i][j-1]
        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j] + dp[i][j-1];
            }
        }


        //遍历顺序从左往右；返回最后的结果
        return dp[m-1][n-1];
    }
}
