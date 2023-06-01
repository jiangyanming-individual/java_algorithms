package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/3/23
 * @time 9:31
 * @project java_算法
 **/
public class rob_198 {

    public int rob (int[] nums){
        //确定dp数组dp[i] 是前i个房间，能偷到的最大的金额；

        int[] dp=new int[nums.length+1];
        //确定递推数组：dp[i]=max(dp[i-1],dp[i-2] +nums[i])
        // 偷i和前i-2个房间的最大金额；和不偷i，那就考虑前i-1个房间的最大金额；

        //初始化dp dp[0]=nums[0] dp[1]=max(nums[0],nums[1]) dp[i]是前i个房间中能偷取的最大金额
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);

        //遍历：
        for (int i=2;i<=nums.length-1;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[nums.length-1];
    }
}
