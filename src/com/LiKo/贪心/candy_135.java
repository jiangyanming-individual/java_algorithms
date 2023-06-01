package com.LiKo.贪心;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Arrays;

/**
 * @author Lenovo
 * @date 2023/3/11
 * @time 16:01
 * @project java_算法
 **/
public class candy_135 {


    public int candy(int[] ratings){
        //初始化全为1‘
        int [] candy=new int[ratings.length];
        //初始化candy都为1
        Arrays.fill(candy,1);
        for (int i=1;i< ratings.length;i++){

            if (ratings[i] > ratings[i-1]){

                //如果右边的数组值比左边的数组大的话;candy的值等于candy[i-1]+1
                candy[i]=candy[i-1]+1;
            }
        }
        //倒叙遍历：如果左边的数组值比右边的数组值大的话
        for (int j= ratings.length-2; j>=0;j--){
            //当前的j指向倒数第二个元素：
            if (ratings[j]> ratings[j+1]){
                //取出最大的值：
                candy[j]=Math.max(candy[j+1]+1,candy[j]);
            }
        }
        //计算总需要的糖果数量：
        int totalCount=0;
        for (int i=0;i<candy.length;i++){
            totalCount+=candy[i];
        }
        return totalCount;
    }
}
