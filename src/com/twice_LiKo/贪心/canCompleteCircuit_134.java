package com.twice_LiKo.贪心;

/**
 * @author Lenovo
 * @date 2023/4/10
 * @time 8:27
 * @project java_算法
 **/
public class canCompleteCircuit_134 {

    public int canCompleteCircuit(int[] gas,int[] cost){

        int resSum=0;//前i个加油站所剩余的油量；
        int totalSum=0;//所有加油站所剩余的总油量；
        int start=0;
        for (int i=0;i< gas.length;i++){
            resSum+=gas[i]- cost[i];
            totalSum+= gas[i]- cost[i];

            //前i个加油站都不能作为开始的地方：
            if (resSum<0){
                start=i+1;
                resSum=0;
            }
        }

        //如果最终的剩余总油量都小于0 ，那是一定不能环绕一圈的；
        if (totalSum<0){
            return -1;
        }
        return start;
    }
}
