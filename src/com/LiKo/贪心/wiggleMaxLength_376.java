package com.LiKo.贪心;

import java.util.PropertyResourceBundle;

/**
 * @author Lenovo
 * @date 2023/3/7
 * @time 21:10
 * @project java_算法
 **/
public class wiggleMaxLength_376 {


    public int wiggleMaxLength(int[] nums){

        //使用prediff 和 curdiff

        int prediff=0;
        int curdiff=0;
        int result=0;//记录结果

        for (int i=0;i< nums.length-1;i++){

            curdiff=nums[i+1] -nums[i];
            if (prediff >=0 && curdiff < 0 || prediff<=0 && curdiff>0) {
                result+=1;
                prediff=curdiff;//当有摆动的时候才进行pre和cur的互换
            }

        }
        return result;
    }
}
