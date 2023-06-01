package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/4/2
 * @time 10:33
 * @project java_算法
 **/
public class numDistinct_115 {

    public int numDistinct(String s,String t){
        //确定dp
        int [][] dp=new int[s.length()+1][t.length()+1];
        //递推公式 dp[i][j]=dp[i-1][j-1] 可以由s[i-2]和t[i-2] 或者s[i-3]和t[i-1]得到；
        // + dp[i-1][j] //s字符串进行减1的操作；

        //dp[i][j]=dp[i-1][j]

        //初始化dp[i][0] dp[0][j] dp[0][0]

        for (int i=1;i<=s.length();i++){
            //第一列 t是字符串，然后s非空；
            dp[i][0]=1;
        }

        for (int j=1;j<=t.length();j++){
            // 第一行； s是空字符串
            dp[0][j]=0;
        }
        //第一个元素
        dp[0][0]=1;

        for (int i=1;i<=s.length();i++){
            for (int j=1;j<=t.length();j++){

                if (s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1] +dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }

        return dp[s.length()][t.length()]; //返回一个最终的结果
    }
}
