package com.LiKo.vector;

/**
 * @author Lenovo
 * @date 2023/2/3
 * @time 19:19
 * @project java_算法
 **/


/**
 *
 * 长度最小的子数组；
 *
 * **/
public class min_length_subvector {

//    public int minSubArrayLen(int target, int[] nums) {
//
//
//        int res_length=Integer.MAX_VALUE;//设置int最大的值；
//        int i,j;
//        int sub_length=0; //子数组的长度
//        int sum =0; //设置集合的和
//        for(i=0,j=0;j< nums.length;j++){
//
//            sum+= nums[j];
//            while (sum>=target){
//               sub_length=j-i+ 1;
//               res_length=res_length < sub_length? res_length:sub_length;//更新最小的长度；
//               sum=sum-nums[i];
//               i++;
//            }
//        }
//
//        if(res_length == Integer.MAX_VALUE){//没有找到；返回0
//            return 0;
//        }else{//找到了，返回res_length;
//            return res_length;
//        }
//    }


//    /****
//     *
//     * 暴力求解的方法：
//     * **/
//    public int minSubArrayLen(int target, int[] nums) {
//        int res_length=Integer.MAX_VALUE;//设置长度；
//        int sub_length=0;
//        for (int i=0;i< nums.length;i++){
//            int sum=0;
//            for (int j=i;j< nums.length;j++){
//                sum+=nums[j];
//                if(sum>=target){
//                    sub_length=j-i+1;
//                    res_length=res_length < sub_length ? res_length:sub_length;
//                    break;//如果找到了就直接退出，因为依次循环找到一个就好；
//                }
//            }
//        }
//        return  res_length == Integer.MAX_VALUE ? 0: res_length;
//
//    }
 /****
  *
  * 暴力求解
  *
  * ******/
    public int minSubArrayLen1(int target, int[] nums) {

        int res=Integer.MAX_VALUE;
        int sub_length=0;//设置子长度；
        for (int i=0;i< nums.length;i++){
            int sum=0; //每次更新sum的值；
            for (int j=i;j<nums.length;j++){
                sum+=nums[j];
                if (sum>=target){
                    sub_length=j-i+1;
                    res= res< sub_length ? res : sub_length;
                    break;
                }
            }
        }
        return res == Integer.MAX_VALUE ? 0: res;
    }
/*****
 *
 * 滑动窗口
 *
 * ****/
    public int minSubArrayLen(int target, int[] nums) {

        int i=0,j=0;//j指向后面
        int res_length=Integer.MAX_VALUE;
        int sub_length=0;
        int sum=0;
        for (j=0; j< nums.length;j++){
            sum+=nums[j];
            while (sum>=target){
                sub_length=j-i+1;
                res_length= res_length< sub_length ? res_length : sub_length;
                sum-=nums[i];//将i值往前移动；直到找到最小的窗口；
                i++;
            }
        }
        return res_length == Integer.MAX_VALUE ? 0 : res_length;
    }
}
