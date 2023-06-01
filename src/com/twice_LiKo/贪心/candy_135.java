package com.twice_LiKo.贪心;

import java.util.Arrays;

/**
 * @author Lenovo
 * @date 2023/4/11
 * @time 7:50
 * @project java_算法
 **/
public class candy_135 {

    public int candy(int[] ratings){

        int[] candyVec=new int[ratings.length];
        Arrays.fill(candyVec,1);

        //先找右边比左边大的，直接加1；
        for (int i=1;i< ratings.length;i++){

            if (ratings[i]>ratings[i-1]){
                candyVec[i]=candyVec[i-1]+1;//比左边的个数要多1；
            }
        }

        //再找左边比右边的大的
        for (int i= ratings.length-2;i>=0;i--){
            if (ratings[i]> ratings[i+1]){
                //取最大的数量：
                candyVec[i]=Math.max(candyVec[i],candyVec[i+1]+1);
            }
        }

        int sum=0;
        //统计总的数量；
        for (int i=0;i<candyVec.length;i++){
            sum+=candyVec[i];
        }
        return sum;
    }
}
