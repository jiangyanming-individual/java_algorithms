package com.twice_LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/5/11
 * @time 9:34
 * @project java_算法
 **/
public class canPartition_416 {
    public static void main(String[] args) {
        int[] nums={3,3,3,4,5};
        canPartition(nums);
    }
    public static boolean canPartition(int[] nums){

        //计算总和
        int sum=0;
        for (int i=0;i< nums.length;i++){
            sum+=nums[i];
        }
        //不能凑成两个子集相等的情况；
        if (sum % 2 == 1){
            return false;
        }

        int target=sum / 2;//背包总量；

        //使用滚动数组：
        int[] dp=new int[target+1];

        for (int i=0;i< nums.length;i++){

            for (int j=target;j>=nums[i];j--){
                dp[j]=Math.max(dp[j],dp[j-nums[i]] + nums[i]);
            }
        }

        for (int j=0;j<= target;j++){
            System.out.print(dp[j]+" ");
        }

        return dp[target] == target;
    }
}
