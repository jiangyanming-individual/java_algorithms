package com.twice_LiKo.动态规划;


/***
 * 编辑距离：所使用最小的操作数：
 */
public class minDistance_72 {

    public int minDistance(String word1,String word2){

        //确定dp
        int[][] dp=new int[word1.length()+1][word2.length()+1];

        //递推 ：相等dp[i][j]=dp[i-1][j-1]
        //dp[i][j]=min(dp[i-1][j]+1(替换只替换一个字符),dp[i-1][j]+1(word1删除元素一个元素) ,dp[i][j-1]+1(word2删除一个元素))

        //初始化：
        for (int i=0;i<=word1.length();i++){
            dp[i][0]=i;
        }

        for (int j=0;j<=word2.length();j++){
            dp[0][j]=j;
        }
        //确定遍历顺序：
        for (int i=1;i<=word1.length();i++){
            for (int j=1;j<=word2.length();j++){
                if (word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.min(dp[i-1][j-1]+1,Math.min(dp[i-1][j]+1,dp[i][j-1]+1));
                }
            }
        }
        //返回dp的结果
        return dp[word1.length()][word2.length()];
    }
}
