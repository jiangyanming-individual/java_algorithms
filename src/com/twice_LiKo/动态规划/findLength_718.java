package com.twice_LiKo.动态规划;


/**
 * 求的是最长公共子数组
 */
public class findLength_718 {

    public int findLength(int[] nums1,int [] nums2){

        int res=0;
        //确定dp dp[i][j] 表示A[i] == B[j]的最长公共子数组：
        int[][] dp=new int[nums1.length+1][nums1.length+1];
        //递归公式：dp[i][j]=dp[i-1][j-1] +1;


        //初始化dp
        for (int i=0;i<nums1.length;i++){

            if (nums1[i] == nums2[0]){
                dp[i][0]=1;
            }
        }

        for (int j=0;j< nums2.length;j++){
            if (nums1[0] == nums2[j]){
                dp[0][j]=1;
            }
        }

        //确定遍历顺序
        for (int i=0;i<nums1.length;i++){

            for (int j=0;j< nums2.length;j++){
                //防止出现负数的情况：
                if (nums1[i] == nums2[j] && i>0 && j>0){
                    dp[i][j] =dp[i-1][j-1]+1;
                }

                if (dp[i][j] >res){
                    res=dp[i][j];
                }
            }
        }

        return res;
    }
}
