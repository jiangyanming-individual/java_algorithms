package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/3/22
 * @time 9:36
 * @project java_算法
 **/
public class combinationSum4_377 {


    public int combinationSum4(int [] nums,int target){

        //确定dp
        int [] dp=new int[target+1];
        //确定递推公式dp[j]+=dp[j-weight[i]];
        //初始化dp[0]=1;
        dp[0]=1;


        //先遍历物品再遍历背包，求的就是组合数，不强调数的排列问题；
        //先遍历背包再遍历物品，是求排列数；

        //先遍历背包：
        for (int i=0;i<=target;i++){
            //遍历物品：
            for (int j=0;j<nums.length;j++){
                if (i>=nums[j]){
                    //如果背包的容量大于nums[i]的大小，就可以直接装入到背包中；
                    dp[i]+=dp[i-nums[j]];
                }

            }
        }
        return dp[target];
    }
}
