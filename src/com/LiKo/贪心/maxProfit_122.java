package com.LiKo.贪心;

/**
 * @author Lenovo
 * @date 2023/3/9
 * @time 21:40
 * @project java_算法
 **/
public class maxProfit_122 {

    public int maxProfit(int [] prices){
        int res=0;
        //最大股票的价格：每次比较当天与前一天的差值，收取整数：

        for (int i=1;i<prices.length;i++){
            //每次都取当天比前一天的价格高的
            res+=Math.max(prices[i]-prices[i-1],0);//
        }

        return res;
    }
}
