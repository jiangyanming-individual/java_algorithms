package com.twice_LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/4/7
 * @time 9:54
 * @project java_算法
 **/
public class uniquePathsWithObstacles_63 {

    public int uniquePathsWithobstacles(int [][] obstacle){

        int m=obstacle.length;
        int n=obstacle[0].length;
        //确定dp: dp[i][j]到达 i j能有几条路径；
        int [][] dp=new int[m][n];
        //递推公式dp[i][j]= dp[i-1][j] +dp[i][j-1]

        //初始化 遇到障碍就直接后面全部赋值为0
        for (int i=0;i<m && obstacle[i][0]==0;i++){
            dp[i][0]=1;
        }
        for (int j=0;j<n && obstacle[0][j] == 0;j++){
            dp[0][j]=1;
        }


        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                if (obstacle[i][j] ==1){
                    //如果遇到阻塞就直接跳过，因为赋值是0；
                    continue;
                }
                //递推公式：
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
