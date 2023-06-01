package com.twice_LiKo.动态规划;

public class rob_213 {

    /**
     * 选头不选尾，选尾不选头
     * @param nums
     * @return
     */
    public int rob(int[] nums){

        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];

        //1 选头不选尾：
        int res1=select_rom(nums,0,nums.length-2);//实际的下标；

        //2 选尾不选头
        int res2=select_rom(nums,1, nums.length-1);//实际的下标
        return Math.max(res1,res2);
    }

    public int select_rom(int[] nums,int begin,int end){

        //如 num.length == 2 的情况；这时begin和end是相等的
        if (begin == end){
            return nums[begin];
        }
        //确定dp
        int[] dp=new int[nums.length];
        //初始化dp;初始化前两个元素
        dp[begin]=nums[begin];
        dp[begin +1]=Math.max(nums[begin],nums[begin]);

        for (int i=begin+2;i<=end;i++){
            //递归公式是一样的；
            dp[i]=Math.max(dp[i-1],dp[i-2] + nums[i]);
        }
        return dp[end];
    }

}
