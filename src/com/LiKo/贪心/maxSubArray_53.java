package com.LiKo.贪心;

/**
 * @author Lenovo
 * @date 2023/3/9
 * @time 21:25
 * @project java_算法
 **/
public class maxSubArray_53 {

    public int maxSubArray(int[] nums){
        int res=Integer.MIN_VALUE;
        //两层暴力：
        int sum=0;
        for (int i=0;i< nums.length;i++){
            sum+=nums[i];
            //记录最大和
            if (sum > res) res=sum;
            if (sum < 0){
                //如果最大和小于0 ，就直接重新选取连续的子序列；
                sum=0;
            }
        }
        return res;
    }
}
