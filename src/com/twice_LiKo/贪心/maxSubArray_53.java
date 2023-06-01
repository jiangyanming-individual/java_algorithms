package com.twice_LiKo.贪心;

import org.omg.CORBA.INTERNAL;

/**
 * @author Lenovo
 * @date 2023/4/7
 * @time 21:38
 * @project java_算法
 **/
public class maxSubArray_53 {

    //使用动态规划的方式
//    public int maxSubArray(int [] nums){
//
//        int res=nums[0]; //当前的res是nums[0];
//        int [] dp=new int[nums.length];
//        //dp是最大和的连续子数组的dp[i];
//        //dp[i]=max(dp[i-1]+nums[i],nums[i])
//
//        //初始化dp[0]=nums[0];
//
//        for (int i=1;i<nums.length;i++){
//
//            dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
//            if (dp[i]>res){
//                //比较出来最大的
//                res=dp[i];
//            }
//        }
//        return res;
//    }

    public int maxSubArray(int [] nums){

        int res= Integer.MIN_VALUE;//设置成最小的；
        int sum=0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];

            if (sum>res){
                res=sum;
            }
            if (sum<0){
                sum=0;//重新开始计数；
            }
        }
        return res;
    }
}


