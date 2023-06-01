package com.LiKo.贪心;

/**
 * @author Lenovo
 * @date 2023/3/26
 * @time 20:32
 * @project java_算法
 **/
public class maxProfit_121 {

    public int maxProfit(int[] prices){
        //贪心策略，每次取最左边的最小值，取右边最大的值：

        int low =Integer.MAX_VALUE;
        int res=0;//最大的利润；

        for (int i=0;i<prices.length;i++){

            low=Math.min(low,prices[i]);//找到最右边最小的值；
            res=Math.max(res, prices[i]-low);
        }

        return res;

    }
}
