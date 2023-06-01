package com.LiKo.贪心;

import java.util.Arrays;

/**
 * @author Lenovo
 * @date 2023/3/13
 * @time 8:50
 * @project java_算法
 **/
public class findMinArrowShots_452 {

    public int findMinArrowShots(int[][] points){
        //使用贪心的策略；如果两个气球重叠的话，就求出最小的右边界；

        //如果第二个气球的最小左边界大于第一个气球的右边界时，说明两个气球不重合，需要新的一枝箭

        //对气球进行升序排序：
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        int count=1;//至少需要一只箭
        //按行进行遍历：
        for (int i=1;i< points.length;i++){
            if (points[i][0] > points[i-1][1]){
                //如果说第二个气球的左边界，大于第一个气球的右边界，说明需要一只箭进行射击。
                count++;
            }else{
                //两个气球重叠之后，更新最小的有边界；
                points[i][1]= Math.min(points[i][1],points[i-1][1]);
            }
        }

        return count;
    }
}
