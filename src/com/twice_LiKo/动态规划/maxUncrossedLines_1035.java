package com.twice_LiKo.动态规划;


/**
 * 跟求得最长公共子序列是一样的;要考虑子序列的顺序
 */
public class maxUncrossedLines_1035 {

    public int maxUncrossedLines(int[] nums1,int[] nums2){


        int res=0;
        //确定dp[i][j]

        int[][] dp=new int[nums1.length+1][nums2.length+1];

        //初始化dp[i][0] ==0 dp[0][j]==0

        //递推公式：dp[i][j] =dp[i-1][j-1]+1; 或者dp[i][j]=max(dp[i-1][j],dp[i][j-1]);

        for (int i=1;i<=nums1.length;i++){
            for (int j=1;j<= nums2.length;j++){
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
