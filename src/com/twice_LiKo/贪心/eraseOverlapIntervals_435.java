package com.twice_LiKo.贪心;

import java.util.Arrays;

/**
 * @author Lenovo
 * @date 2023/4/23
 * @time 20:38
 * @project java_算法
 **/
public class eraseOverlapIntervals_435 {


    public int eraseOverlapIntervals(int[][] intervals){

        //更新最小的有边界；

        //按左边界升序：
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int count=0;

        for (int i=1;i<intervals.length;i++){
            if (intervals[i][0]<intervals[i-1][1]){
                //如果第二个的左边界，小于第一个的右边界；更新第i个的最小右边界；
                intervals[i][1]=Math.min(intervals[i][1],intervals[i-1][1]);
                count++;
            }
        }
        return count;
    }
}
