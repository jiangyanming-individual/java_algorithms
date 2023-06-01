package com.twice_LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/4/7
 * @time 9:35
 * @project java_算法
 **/
public class uniquePaths_62 {


    public int uniquePaths(int m,int n){

        //确定dp数组 dp[i][j]走i j的能有多少路径：
        int [][] dp=new int[m][n];

        //确定一递推公式：dp[i][j]=dp[i][j-1]+ dp[i-1][j];

        //初始化 dp[i][0]=1 dp[0][j]=1;

        for (int i=0;i<m;i++){
            dp[i][0]=1; //竖着走只有一条路
        }
        for (int j=0;j<n;j++){
            dp[0][j]=1;//横着走，只有一条路；
        }

        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                dp[i][j]=dp[i][j-1]+dp[i-1][j];
            }
        }
        return dp[m-1][n-1];
    }
}
