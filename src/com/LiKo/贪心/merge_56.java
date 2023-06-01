package com.LiKo.贪心;

import com.sun.xml.internal.bind.v2.model.core.EnumLeafInfo;
import jdk.nashorn.internal.ir.CallNode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/3/14
 * @time 9:01
 * @project java_算法
 **/
public class merge_56 {

    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        //先对数组进行升序排序
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int start = intervals[0][0];//记录第一个数组的左边界
        int move_right = intervals[0][1];//记录右边界；
        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] > intervals[i - 1][1]) {
                //如果i 的左边界大于i-1的右边界，就直接加入i-1;
                res.add(new int[]{start, move_right});
                //更新左右边界：
                start = intervals[i][0];
                move_right = intervals[i][1];
            } else {
                // i的左边界小于等于 i-1的右边界；更新最大右边界的值
                move_right = Math.max(move_right, intervals[i][1]);
            }


        }
        //加入最后一个区间
        res.add(new int[]{start,move_right});
        //将list转为二维数组：
        return res.toArray(new int[res.size()][]);
    }

}