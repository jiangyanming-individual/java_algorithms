package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/4/1
 * @time 9:47
 * @project java_算法
 **/
public class maxUncrossedLines_1035 {

    public int maxUncrossedLines(int[] nums1,int[] nums2){

        //求最长公共子序列的长度：
        int res=0;
        int [][] dp=new int[nums1.length+1][nums2.length+1];

        //dp[i][j]={dp[i-1][j-1]+1,max(dp[i-1][j],dp[i][j-1])}

        for (int i=1;i<=nums1.length;i++){

            for (int j=1;j<=nums2.length;j++){
                if (nums1[i-1] == nums2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }

                if (dp[i][j] >res){
                    res=dp[i][j];
                }
            }
        }
        return res;
    }
}
