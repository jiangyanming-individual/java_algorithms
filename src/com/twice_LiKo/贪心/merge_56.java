package com.twice_LiKo.贪心;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/5/10
 * @time 9:43
 * @project java_算法
 **/
public class merge_56 {
    /**
     * 合并区间
     * @param intervals
     * @return
     */
    public int[][] merge(int[][] intervals){

        List<int[]> res=new ArrayList<>();
        //先对数组按照左边界进行排序
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        int left=intervals[0][0];
        int move_right= intervals[0][1];//可以变的右区间；

        for (int i=1;i< intervals.length;i++){

            if (intervals[i][0]>move_right){
                //不重叠：
                res.add(new int[]{left,move_right});
                //更新左右边界
                left= intervals[i][0];
                move_right= intervals[i][1];
            }else{
                //如果i的右边界小于move_right;说明重叠了,更新最大的边界；
                move_right=Math.max(move_right, intervals[i][1]);
            }
        }
        //最后一个加入到res
        res.add(new int[]{left,move_right});
        return res.toArray(new int[res.size()][]);//转为二维数组；
    }

}
