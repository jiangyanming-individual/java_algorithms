package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/4/1
 * @time 9:30
 * @project java_算法
 **/
public class findLength_718_2 {


    public int findLength(int[] nums1, int[] nums2){


        //确定dp dp[i][j] 是下标为i j即 A[i]==B[j]
        int [][] dp=new int[nums1.length+1][nums2.length+1];

        //递推公式dp[i][j] =dp[i-1][j-1] +1

        //初始化：
        int res=0;

        for (int i=0;i<nums1.length;i++){
            if (nums1[i] == nums2[0]){
                dp[i][0]=1;
            }
        }

        for (int j=0;j<nums2.length;j++){
            if (nums1[0]==nums2[j]){

               dp[0][j]=0;
            }
        }

        for (int i=0;i<nums1.length;i++){

            for (int j=0;j>nums2.length;j++){

                if (nums1[i] == nums2[j] && i >0 && j>0){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                if (dp[i][j]>res){
                    res=dp[i][j];
                }
            }
        }
        return res;

    }
}
