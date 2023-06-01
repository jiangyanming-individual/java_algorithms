package com.twice_LiKo.贪心;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Lenovo
 * @date 2023/4/12
 * @time 8:59
 * @project java_算法
 **/
public class reconstructQueue_406 {


    //遇到两个维度的数组，先确定一个，然后在确定另外一个
    public int[][] reconstructQueue(int[][] people){

        //先进行降序排序：
        Arrays.sort(people,(a,b)->{
            if (a[0] == b[0]){
                //如果第一个元素相等，那么就按第二个元素进行升序排列；
                return a[1]=b[1];
            }
            return b[0]-a[0];//按第一个降序的方式，
        });

        //Queue只是队列；
        //链表
        LinkedList<int[]> queue = new LinkedList<>();
        //p是一个数组；
        for (int [] p: people) {
            queue.add(p[1],p);
        }

        //将队列转为 数组；
        int[][] res = queue.toArray(new int[people.length][]);
        return res;
    }
}
