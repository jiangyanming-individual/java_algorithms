package com.twice_LiKo.动态规划;


/**
 * 判断子序列
 */
public class isSubsequence_392 {

    public boolean isSubsequence(String s,String t){
        //初始化dp
        int[][] dp=new int[s.length()+1][t.length()+1];

        //递推 s[i-1]==t[j-1] dp[i][j]=dp[i-1][j-1]+1;
        //dp[i][j]= dp[i][j-1]; t字符串回退

        //初始化dp  dp[0][0]=0;dp[i][0]=0 ;dp[0][j]=0;
        for (int i=1;i<=s.length();i++){
            for (int j=1;j<=t.length();j++){
                if (s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    //字符不相等：
                    dp[i][j]=dp[i][j-1];
                }
            }
        }
        return dp[s.length()][t.length()] == s.length() ? true :false ;
    }
}
