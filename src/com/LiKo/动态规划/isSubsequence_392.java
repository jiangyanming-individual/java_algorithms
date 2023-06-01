package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/4/2
 * @time 10:08
 * @project java_算法
 **/
public class isSubsequence_392 {

    public boolean isSubsequence(String s,String t){

        //确定dp数组 dp[i][j] 表示A[i-1]和B[i-1]的字符相等的情况
        int [][] dp=new int[s.length()+1][t.length()+1]; //加1的操作
        //确定递推公式dp[i][j]={dp[i-1][j-1] +1 ,如果A[i-1]!=B[j-1] 那么dp[i][j-1]};


        //初始化 dp[i-1][j-1] --> dp[0][0]=0;  dp[i][0]--->0
        for (int i=1;i<=s.length();i++){

            for (int j=1;j<=t.length();j++){
                if (s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    //如果s[i-1] !=t[j-1] ---->  t-1
                    dp[i][j]=dp[i][j-1];
                }
            }
        }
        if (dp[s.length()][t.length()] ==s.length()){
            return true;
        }
        return false;
    }
}
