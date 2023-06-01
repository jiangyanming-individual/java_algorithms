package com.LiKo.贪心;

/**
 * @author Lenovo
 * @date 2023/3/11
 * @time 9:20
 * @project java_算法
 **/
public class canCompleteCircuit_134 {

    public int canCompleteCircuit(int[] gas,int[] cost){

        int curSum=0;
        int totalSum=0;
        int start=0;

        for(int i=0;i< gas.length;i++){
            //记录当前几个加油站剩余总的油量
            curSum+=(gas[i]-cost[i]);
            //记录总的剩余油量
            totalSum+=(gas[i] - cost[i]);
            if (curSum < 0){
                start=i+1;
            }
        }

        if (totalSum<0){
            return -1;
        }
        return start; //表示前面的都不可以，只有从这个开始才有可能
    }
}
