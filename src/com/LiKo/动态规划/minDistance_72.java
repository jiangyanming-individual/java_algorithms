package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/4/3
 * @time 8:09
 * @project java_算法
 **/
public class minDistance_72 {

    public int minDistance(String word1,String word2){


        //确定dp数组：
        int [][] dp=new int[word1.length()+1][word2.length()+1];

        //确定递推公式
        // dp[i][j]={dp[i-1][j-1](word1[i-1] == word2[j-1])
        // word1[i-1]!=word2[j-1]    dp[i][j]=min(dp[i-1][j-1]+1(直接替换元素),dp[i-1][j]+1(word1删除元素),dp[i][j-1]+1(word2删除元素))}

        //初始化dp

        for (int i=0;i<=word1.length();i++){
            dp[i][0]=i;
        }
        for (int j=0;j<=word2.length();j++){
            dp[0][j]=j;
        }

        //确定遍历顺序：

        for (int i=1;i<=word1.length();i++){
            for (int j=1;j<=word2.length();j++){
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1];//相等的话不需要操作；
                }else{
                    dp[i][j]=Math.min(Math.min(dp[i-1][j-1]+1,dp[i-1][j]+1),dp[i][j-1]+1);
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
