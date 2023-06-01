package com.twice_LiKo.动态规划;

/**
 * 回文字串
 */
public class countSubstrings_647 {


    public int countSubstring(String s){

        //确定dp数组 dp[i][j] 表示从[i,j]这个区间是不是回文字串；
        boolean [][] dp=new boolean[s.length()][s.length()];

        //递推公式：dp[i][j]
        //初始化dp[i][j]=false;
        int res=0;//有多少回文字串；

        for (int i=s.length()-1;i>=0;i--){

            for (int j=i;j<s.length();j++){
                if (s.charAt(i) == s.charAt(j)){
                    //如果i和j相差<=1 ===>a aa的类型
                    if (j-i<=1){
                        res++;
                        dp[i][j]=true;
                    }else if (dp[i+1][j-1] == true){
                        //aabaa这种类型；相差大于1；
                        res++;
                        dp[i][j]=true;
                    }
                }
            }
        }

        return res;
    }
}
