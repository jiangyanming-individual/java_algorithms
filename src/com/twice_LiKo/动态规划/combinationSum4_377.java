package com.twice_LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/5/13
 * @time 9:48
 * @project java_算法
 **/
public class combinationSum4_377 {


    /**
     * 因为这个问题求的排列数，所以需要先遍历背包在遍历物品,才会出现(1,2) (2,1)的情况；
     * @param nums
     * @param target
     * @return
     */
    public int combinationSum4(int[] nums,int target){

        //确定dp：
        int[] dp=new int[target+1];

        //递归公式：dp[j]+=dp[j-nums[i]];

        //初始化dp
        dp[0]=1;

        //dp的遍历顺序：
        for (int i=1;i<=target;i++){
            for (int j=0;j<nums.length;j++){
                if (i>=nums[i]){
                    //如果背包容量大于物品质量；
                    dp[i]+=dp[i-nums[j]];
                }
            }
        }
        return dp[target];
    }
}
