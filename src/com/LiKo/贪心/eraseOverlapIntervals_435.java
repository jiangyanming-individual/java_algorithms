package com.LiKo.贪心;

import java.util.Arrays;

/**
 * @author Lenovo
 * @date 2023/3/13
 * @time 9:40
 * @project java_算法
 **/
public class eraseOverlapIntervals_435 {


    public int eraseOverlapIntervals(int [][] intervals){
        //对数组进行排序的操作：
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int count=0;

        for (int i=1;i<intervals.length;i++) {

            //如果i的左边界小于 i-1的右边界，说明重合了
            if (intervals[i][0] < intervals[i - 1][1]) {
                //更新合法的右边界；
                intervals[i][1] = Math.min(intervals[i][1], intervals[i - 1][1]);
                count++;
                continue;
            }

        }
        return count;
    }
}
