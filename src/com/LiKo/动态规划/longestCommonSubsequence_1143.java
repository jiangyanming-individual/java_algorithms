package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/4/1
 * @time 9:19
 * @project java_算法
 **/
public class longestCommonSubsequence_1143 {


    public int longestCommonSubsequence(String text1,String text2){

        //确定dp[i][j] 是下标text1[i-1] 和 text2[j-1]相等的情况；
        int[][] dp=new int[text1.length()+1][text2.length()+1];

        //递推text1[i-1]== text2[j-1]或者 text1[i-1]!=text2[j-1]
        // ===>>dp[i][j]={dp[i-1][j-1] +1, max(dp[i-1][j],dp[i][j-1])}

        //初始化 dp[i][0]=0,dp[0][j]=0;
        int res=0;
        for (int i=1;i<=text1.length();i++){
            for (int j=1;j<=text2.length();j++){

                if (text1.charAt(i-1) == text2.charAt(j-1)){
                    //相等的情况：
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    //不相等的情况
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
