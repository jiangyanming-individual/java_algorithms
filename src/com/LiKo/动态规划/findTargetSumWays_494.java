package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/3/21
 * @time 9:56
 * @project java_算法
 **/
public class findTargetSumWays_494 {

    public int findTargetSumWays(int[] nums,int target){

        int add_total=0,reduce_total=0;
        int sum=0;//总和
        for (int i=0;i< nums.length;i++){
            sum+=nums[i];
        }

        if ((target+sum) %2 ==1 ){
            return 0;
        }
        add_total=(sum +target) / 2;//背包的容量；

        //确定dp dp是加和为add_total的总数有多少种方法；
        int [] dp=new int[add_total+1];

        //递推公式：dp[j]+=dp[j-nums[i]]

        //初始化dp
        dp[0]=1;

        //先遍历数
        for (int i=0;i< nums.length;i++){

            //遍历背包；
            for (int j=add_total;j>=nums[i];j--){
                dp[j]+=dp[j-nums[i]];
            }
        }
        return dp[add_total];
    }
}
