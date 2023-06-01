package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/4/3
 * @time 8:38
 * @project java_算法
 **/
public class countSubstrings_647 {

    public int countSubstrings(String s){

        //确定dp数组 dp[i][j] 表示从[i,j]这个区间是不是回文字串；
        boolean [][] dp=new boolean[s.length()][s.length()];

        int res=0;//有多少个回文字串；
        //确定推导公式
        //dp[i][j] =dp[i+1][j-1] == true;

        //初始化dp dp[i][j]=false

        //确定遍历顺序 ;从下到上，从左到右；
        for (int i=s.length()-1;i>=0;i--){


            for (int j=i;j<=s.length()-1;j++){
                //j>=i ====>[i,j]
                if (s.charAt(i) == s.charAt(j)){

                    if (j-i<=1){
                        dp[i][j]=true;
                        res++;
                    }else if(dp[i+1][j-1]){

                        //如果dp[i+1][j-1]这个区间的子串也是回文串的话，dp[i][j]=true;
                        dp[i][j]=true;
                        res++;
                    }
                }
            }
        }
        return res;
    }
}
