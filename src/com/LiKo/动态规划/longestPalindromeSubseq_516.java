package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/4/3
 * @time 9:14
 * @project java_算法
 **/
public class longestPalindromeSubseq_516 {

    public int longestPalindromeSubseq(String s){


        //确定dp dp[i][j] 表示[i,j]字串中回文串的长度；
        int [][] dp=new int[s.length()][s.length()];

        //递推公式：如果s[i] == s[j] dp[i][j] =dp[i+1][j-1] +2;
        //如果s[i] != s[j] dp[i][j]=min(dp[i][j-1],dp[i+1][j])

        //初始化dp

        for (int i=0;i<s.length();i++){
            dp[i][i]=1;// 字符串的长度是1;
        }
        //确定遍历顺序：

        for (int i=s.length()-1;i>=0;i--){

            for (int j=i+1;j<=s.length()-1;j++){
                //因为i ==ｊ的情况已经被初始化了　所以区间长度应该大于等于２；
                if (s.charAt(i) == s.charAt(j)){
                    dp[i][j]=dp[i+1][j-1]+2;
                }else{
                    dp[i][j]=Math.min(dp[i+1][j],dp[i][j-1]);
                }
            }
        }

        return dp[0][s.length()-1];//第一行，最后一列
    }
    
}
