package com.twice_LiKo.贪心;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

/**
 * @author Lenovo
 * @date 2023/4/23
 * @time 20:02
 * @project java_算法
 **/
public class findMinArrowShots_452 {

    public int findMinArrowShots(int[][] points){


        int count=1;//最少是需要一只箭，就是全部重合时；
        //线对二维数组进行按第一个元素升序排列：
        Arrays.sort(points, new Comparator<int[]>() {
            //new 一个比较器
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0]>b[0]){
                    return -1; //降序返回-1
                }else if (a[0]<b[0]){
                    return 1;
                }else {
                    return 0;
                }
            }
        });

        //如果第二个气球的左边界，大于第一个气球的有边界，count++;
        //如果两个气球重合，更新最小的有边界；
        for (int i=1;i< points.length;i++){
            //遍历元素；
            if (points[i][0]> points[i-1][1]){
                //不重叠；
                count++;
            }else{
                //更新最小的右边界
                points[i][1]= Math.min(points[i][1], points[i-1][1]);
            }
        }
        return count;
    }
}
