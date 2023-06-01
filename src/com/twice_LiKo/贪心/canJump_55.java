package com.twice_LiKo.贪心;

/**
 * @author Lenovo
 * @date 2023/4/8
 * @time 8:39
 * @project java_算法
 **/
public class canJump_55 {


    public boolean canJump(int[] nums){

        int cover=0;//初始覆盖就是0

        if (nums.length == 1)return true;

        //cover是可以取到等号的
        for (int i=0;i<=cover;i++){
            //每次更新最大的可覆盖的范围；
            cover=Math.max(cover,i+nums[i]);
        }

        if (cover>=nums.length-1){
            return true;
        }
        return false;
    }
}
