package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/4/1
 * @time 8:50
 * @project java_算法
 **/
public class findLength_718 {

    public int findLength(int [] nums1 ,int[] nums2){

        //确定dp数组 dp[i][j] 表示A[i-1] 和B[j-1]下标的数组，有共同长度的子数组的个数；
        int [][] dp=new int[nums1.length][nums2.length];

        //递推公式A[i-1] == B[j-1] dp[i][j]=dp[i-1][j-1] +1;

        int res=0;
        //初始化dp[i][0] =0;dp[0][j]=0;

        for (int i=1;i<nums1.length;i++){

            for (int j=1;j< nums2.length;j++){

               if (nums1[i-1] == nums2[j-1]){ //如果A[i-1] == B[j-1]
                   dp[i][j] = dp[i-1][j-1] +1;
               }
                if (dp[i][j]>res){
                    res=dp[i][j];
                }
            }
        }
        return res;//返回结果
    }
}
