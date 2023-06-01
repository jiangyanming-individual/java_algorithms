package com.twice_LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/5/23
 * @time 8:32
 * @project java_算法
 **/
public class minDistance_583 {

    public int minDistance(String word1,String word2){

        //确定dp  dp[i][j]
        int[][] dp=new int[word1.length()+1][word2.length()+1];

        //递推dp[i][j]=d[i-1][j-1]相等时不需要操作； dp[i][j]=min(dp[i-1][j]+1,dp[i][j-1]+1,dp[i-1][j-1]+2)

        //初始化dp

        for (int i=0;i<=word1.length();i++){
            dp[i][0]=i;
        }
        for (int j =0;j<=word2.length();j++){
            dp[0][j]=j;
        }
        //确定遍历顺序：
        for (int i=1;i<=word1.length();i++){

            for (int j=1;j<=word2.length();j++){
                if (word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else {
                    dp[i][j]=Math.min(dp[i-1][j]+1,Math.min(dp[i][j-1]+1,dp[i-1][j-1]+2));
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
