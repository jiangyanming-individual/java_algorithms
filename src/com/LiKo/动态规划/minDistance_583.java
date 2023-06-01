package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/4/2
 * @time 11:30
 * @project java_算法
 **/
public class minDistance_583 {

    public int minDistance(String word1,String word2){

        //确定dp[i][j] A[i-1] 和B[j-1] 相等所需要的最少的操作次数；
        int [][] dp=new int[word1.length()+1][word2.length()+1];

        //递推公式dp[i][j] ={dp[i-1][j-1], min(dp[i-1][j]+1,dp[i][j-1]+1,dp[i-1][j-1]+2 )}


        //初始化dp dp[i][0] =i dp[0][j]=j

        for (int i=0;i<=word1.length();i++){
            dp[i][0]=i; //word1等于空字符串需要删除 i次
        }
        for (int j=0;j<=word2.length();j++){
            dp[0][j]=j; //word2等于空字符串需要删除 j 次
        }


        for (int i=1;i<=word1.length();i++){
            for (int j=1;j<=word2.length();j++){
                if (word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]; //相等不需要操作；
                }else{
                    dp[i][j]=Math.min(Math.min(dp[i-1][j]+1,dp[i][j-1]+1),dp[i-1][j-1]+2);
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
