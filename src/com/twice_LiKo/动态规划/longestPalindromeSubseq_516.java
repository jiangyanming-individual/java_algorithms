package com.twice_LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/5/24
 * @time 9:30
 * @project java_算法
 **/
public class longestPalindromeSubseq_516 {

    public int longestPalindromeSubseq(String s){

        int res=1; //至少是有一个长度
        //确定dp[i][j]：字符串s在[i, j]范围内最长的回文子序列的长度为dp[i][j]。
        int[][] dp=new int[s.length()][s.length()];
        //递推公式：s[i] == s[j] dp[i][j]=dp[i+1][j-1]+2;
        // s[i]!=s[j] dp[i][j]=max(dp[i+1][j],dp[i][j-1]); i往前加1，j往后减1;

        //初始化；dp[i][i]=1; 只为一个字符的全为1；
        for (int i=0;i<s.length();i++){
            dp[i][i]=1;
        }

        //从下往上，从右往左
        for (int i=s.length()-1;i>=0;i--){
            //因为长度为1的回文字串已经被初始化了；
            for (int j=i+1;j<s.length();j++){
                if (s.charAt(i) == s.charAt(j)){
                    dp[i][j]=dp[i+1][j-1]+2;
                }else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                }
                if (dp[i][j]>res){
                    res=dp[i][j];
                }
            }
        }
        return res;
    }
}
