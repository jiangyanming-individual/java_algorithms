package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/3/23
 * @time 9:59
 * @project java_算法
 **/
public class rob_213 {

    public int rob(int[] nums){

        if (nums.length == 0)return 0;
        if (nums.length == 1)return nums[0];

        //情况2 选择头不选择尾部
        int res1=select_rom(nums,0,nums.length-2); //实际的下标

        //情况3 不选择头，选择尾部；
        int res2=select_rom(nums,1,nums.length-1); //实际的下标

        return Math.max(res1,res2);
    }
    public int select_rom(int[] nums, int begin,int end){

        //特殊情况如果 nums.length=2;
        if(begin == end) return nums[begin];
        //确定dp
        int[] dp=new int[nums.length];//数组的长度；能取到nums.length-1

        //递推dp[i]=Max(dp[i-1],dp[i-2] +nums[i])
        //初始化：
        dp[begin]=nums[begin];
        dp[begin+1]=Math.max(nums[begin],nums[begin+1]);

        //遍历：
        for (int i=begin+2;i<=end;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[end];
    }
}
