package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/3/21
 * @time 10:50
 * @project java_算法
 **/
public class findMaxForm_474 {

    /**
     * 给你一个二进制字符串数组 strs 和两个整数 m 和 n 。
     * 请你找出并返回 strs 的最大子集的长度，该子集中 最多 有 m 个 0 和 n 个 1 。
     * 返回子集个数最大的数是多少；
     *
     * ***/

    public int findMaxForm(String[] strs,int m,int n){

        //确定dp数组 dp[m][n]
        int [][] dp=new int[m+1][n+1];
        //确定递推公式 dp[i][j]=max(dp[i][j],dp[i-x0][j-y1] +1) //dp[i][j]是指不用当前的字符串， dp[i-x0][j-y1] +1 是因为用掉了当前的一个子字符串；
        //先遍历物品
        for (String str : strs) {
            //统计当前字符串中0 1 字符串的个数；
            int x_0=0,y_1=0;
            for (int i=0;i<str.length();i++){
                if (str.charAt(i) == '0') {
                    x_0++;
                }else{
                    y_1++;
                }
            }
            //遍历背包 ，因为背包有两个维度；
            for (int i=m;i>=x_0;i--){

                for (int j=n;j>=y_1;j--){
                    //递推公式，是指当前背包放入str后，需要加1
                    dp[i][j]=Math.max(dp[i][j],dp[i-x_0][j-y_1] +1);
                }
            }

        }

        return dp[m][n];
    }
}
