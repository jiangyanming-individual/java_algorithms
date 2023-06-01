package com.LiKo.贪心;

/**
 * @author Lenovo
 * @date 2023/3/9
 * @time 21:49
 * @project java_算法
 **/
public class canJump_55 {

    public boolean canJump(int [] nums){

        int cover=0;//覆盖范围，如果覆盖范围能将nums.length-1覆盖进行，那么就返回true

        for (int i=0;i<=cover;i++){
            //更新最大的覆盖范围：
            cover=Math.max(i+nums[i],cover);
            if (cover == nums.length-1){
                return true;
            }
        }
        return false;
    }
}
