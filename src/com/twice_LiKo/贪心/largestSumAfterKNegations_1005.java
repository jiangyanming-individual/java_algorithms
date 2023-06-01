package com.twice_LiKo.贪心;

/**
 * @author Lenovo
 * @date 2023/4/10
 * @time 8:12
 * @project java_算法
 **/

/***
 *
 * 贪心的思路：
 * **/
public class largestSumAfterKNegations_1005 {

    public int  largestSumAfterKNegations(int[] nums,int k){
        //1 先将数组按绝对值进行从大到小排序：冒泡排序：
        int temp;
        //n-1次循环
        for (int i=0;i<nums.length-1;i++){

            for (int j=0;j<nums.length-i-1;j++){
                if (Math.abs(nums[j])<Math.abs(nums[j+1])){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }

        //2 将负数变整数，然后k-1
        for (int i=0;i<nums.length;i++){
            if (nums[i]<0 && k>0){
                nums[i]=nums[i] *-1;
                k--;
            }
        }

        //3 如果负数都变正数了，如果k%2 ==0 不用处理，如果k %2 !=0;然后把最小的正数变负数，
        if (k %2!=0){
            nums[nums.length-1]= nums[nums.length-1] * -1;
        }
        //4 求和：
        int sum=0;
        for (int i=0;i< nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
}
