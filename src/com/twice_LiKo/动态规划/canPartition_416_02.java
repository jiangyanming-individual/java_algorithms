package com.twice_LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/5/11
 * @time 10:15
 * @project java_算法
 **/
public class canPartition_416_02 {

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
        System.out.println(target);

        //定义dp
        int [][] dp=new int[nums.length][target+1];

        //初始化dp
        for (int j=1;j<=target;j++){
            dp[0][j]=nums[0];
        }

        for (int i=1;i< nums.length;i++){
            for (int j=1;j<=target;j++){

                if (j<nums[i]){
                    dp[i][j]=dp[i-1][j];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-nums[i]] + nums[i]);
                }
            }
        }


        for (int i=0;i< nums.length;i++){
            for (int j=0;j<=target;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[nums.length-1][target] == target;
    }
}
