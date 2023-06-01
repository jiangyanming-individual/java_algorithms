package com.twice_LiKo.贪心;

/**
 * @author Lenovo
 * @date 2023/4/7
 * @time 8:35
 * @project java_算法
 **/


//没有思路：
public class wiggleMaxLength_376 {

    /***
     *
     * 使用贪心的策略：
     * **/
//    public int wiggleMaxLength(int[] nums){
//
//        int prediff=0;
//        int curdiff=0;
//        int result=1;//默认最右边是有个摆动的元素的；
//
//        for (int i=0;i<nums.length-1;i++){
//
//            curdiff=nums[i+1]-nums[i];
//
//            if (prediff>=0 && curdiff <0 || prediff <=0 && curdiff >0){
//                result+=1;
//                prediff=curdiff;//向后遍历元素；将curdiff赋值给prediff;
//            }
//
//        }
//        return result;
//    }

    /***
     *
     * 使用动态规划的策略：
     *
     * */
    public int wiggleMaxLength(int[] nums){

        //dp[i][0]:作为波峰的最长子序列  dp[i][1]：作为波谷的最长子序列
        int[][] dp=new int[nums.length][2];

        dp[0][0]=1;
        dp[0][1]=1;

        for (int i=1;i<nums.length;i++){

            dp[i][0]=1;
            dp[i][1]=1;//单个元素也可以作为波峰或者波谷；

            //作为波峰的最长子序列
            for (int j=0;j<i;j++){
                if (nums[j]<nums[i]){
                    //作为dp[i][0】
                    dp[i][0]=Math.max(dp[i][0],dp[j][1]+1);
                }
            }
            //作为波谷的最长子序列：
            for (int j=0;j<i;j++){
                if (nums[j]>nums[i]){
                    //作为波谷：
                    dp[i][1]=Math.max(dp[i][1],dp[j][0]+1);
                }
            }
        }

        //nums.length取不到
        return Math.max(dp[nums.length-1][0],dp[nums.length-1][1]);
    }
}
