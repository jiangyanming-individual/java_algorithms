package com.twice_LiKo.动态规划;


public class longestCommonSubsequence_1143 {

    public int longestCommonSubsequence(String text1,String text2){
        int res=0;

        //确定dp
        int[][] dp=new int[text1.length()+1][text2.length()+1];

        //递推公式：dp[i][j]=max(dp[i-1][j],dp[i][j-1]); 或者dp[i-1][j-1]+1;

        //初始化 dp[i][0] 和dp[0][j]全部初始化为0;

        for (int i=1;i<=text1.length();i++){
            for (int j=1;j<=text2.length();j++){

                if (text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1] +1;
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
                if (dp[i][j]>res){
                    res=dp[i][j];
                }
            }
        }
        return res;
    }

}
