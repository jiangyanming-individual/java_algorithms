package com.twice_LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/5/22
 * @time 17:19
 * @project java_算法
 **/
public class numDistinct_115 {

    public int numDistinct(String s,String t){

        //dp[i][j]表示 以s[i-1]为结尾的子序列中出现多少以t[j-1]结尾的个数；
        int [][] dp=new int[s.length()+1][t.length()+1];

        //递推公式dp[i][j]=dp[i-1][j-1] + dp[i-1][j];

        //初始化dp
        for (int i=0;i<=s.length();i++){
            dp[i][0]=1; //t为空字符串；
        }
        for (int j=0;j<=t.length();j++){
            dp[0][j]=0; //s为空字符串；
        }
        dp[0][0]=1; //s t都是空字符串；

        for (int i=1;i<=s.length();i++){
            for (int j=1;j<=t.length();j++){
                //s[i-1] == t[j-1] s使用当前的字符和s不使用当前的字符；
                if (s.charAt(i-1) == t.charAt(i-1)){
                    dp[i][j]=dp[i-1][j-1] + dp[i-1][j];
                }else {
                    dp[i][j]=dp[i-1][j];//s字符串删字符去匹配t
                }
            }
        }
        return dp[s.length()][t.length()];
    }
}
