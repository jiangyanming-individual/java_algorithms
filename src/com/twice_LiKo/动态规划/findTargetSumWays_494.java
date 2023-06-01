package com.twice_LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/5/12
 * @time 8:32
 * @project java_算法
 **/
public class findTargetSumWays_494 {


    public int findTargetSumWays(int[] nums,int target){

        int sum=0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        /**
         不符合条件，凑不成target
         */
        if ((target + sum) % 2 == 1){
            return 0;
        }
        /**
         * target大于sum
         */
        if (Math.abs(target) > sum){
            return 0;
        }
        //加法的总和为bagsize；
        int bagsize=(sum + target) /2;

        //确定dp
        int[] dp=new int[bagsize + 1];

        //初始化dp
        dp[0]=1;

        for (int i=0;i<nums.length;i++){
            for (int j =bagsize ;j>=nums[i];j--){
                dp[j]+=dp[j- nums[i]];//统计总和所以是加法；
            }
        }
        return dp[bagsize];
    }
}
