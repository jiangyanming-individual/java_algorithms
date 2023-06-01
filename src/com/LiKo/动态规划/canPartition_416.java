package com.LiKo.动态规划;

import org.junit.Test;

/**
 * @author Lenovo
 * @date 2023/3/20
 * @time 9:18
 * @project java_算法
 **/
public class canPartition_416 {


//    public static void main(String[] args) {
//        int[] nums ={1,5,11,5};
//        canPartition(nums);
//    }

    @Test
    public void canPartition(){
//        int[] nums=new int[4];
        int [] nums={1,5,11,5};
        int sum=0;
        for (int i=0;i< nums.length;i++){
            sum+=nums[i];
        }
        int target=sum/2;

        //确定dp数组
        int [] dp=new int[target+1];//初始化dp[i]=0

        //确定递推公式 dp[j]=max(dp[j-1],dp[j-nums[i]] +nums[i]) #不加入物品i;
        //初始化dp ---> dp[i] =0
        //先遍历物品

        for (int i=0;i< nums.length;i++){

            //在遍历背包：
            for (int j=target;j>=nums[i];j--) {
                //不加入第i个物品和加入第 i个物品的结果：
                dp[j]=Math.max(dp[j],dp[j-nums[i]] + nums[i]);

            }
        }
//        if (dp[target] == target){
//            return true;
//        }

        //打印dp dp[target]==target;  target =11;
        for (int i=0;i<=target;i++){
            System.out.print(dp[i]+",");
        }
//        return false;
    }
}
