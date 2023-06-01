package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/3/16
 * @time 19:08
 * @project java_算法
 **/
public class uniquePathsWithObstacles_63 {

   public int uniquePathsWithObstacles(int [][] obstacleGrid){
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        //确定dp数组：
       int [][] dp=new int[m][n];

       //初始化dp
       for (int i=0;i<m && obstacleGrid[i][0]==0;i++){
           dp[i][0]=1;
       }

       for (int j=0;j<n && obstacleGrid[0][j] == 0;j++){
          //如果没有阻塞的话，就直接赋值给0
           dp[0][j]=1;
       }
       //确定递推公式； dp[i][j]=dp[i][j-1] + dp[i-1][j] ,有特殊的情况；
       // dp[i+1][j]=dp[i+1][j-1] ;dp[i][j+1]=dp[i-1][j+1]

       //确定遍历顺序：
       for (int i=1;i<m;i++){
           for (int j=1;j<n;j++){
               if (obstacleGrid[i][j]== 1){
                   //如果有阻塞的话就直接跳过；
                   continue;
               }
               dp[i][j]=dp[i-1][j] +dp[i][j-1];
           }
       }

       return dp[m-1][n-1];
   }
}
