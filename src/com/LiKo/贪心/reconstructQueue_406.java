package com.LiKo.贪心;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Lenovo
 * @date 2023/3/12
 * @time 10:01
 * @project java_算法
 **/

/****
 *
 *代码随想录，至少要三遍：
 * 
 *
 * ***/
public class reconstructQueue_406 {
    public int[][] reconstructQueue(int[][] people) {
        // 身高从大到小排（身高相同k小的站前面）
        Arrays.sort(people, (a, b) -> {
            //如果第一个行的数相，就按第二行的数据升序
            if (a[0] == b[0]) return a[1] - b[1];
            //反之按照第一行的数据降序排列：
            return b[0] - a[0];
        });
        //新建一个队列：
        LinkedList<int[]> que = new LinkedList<>();

        for (int[] p : people) {
            //根据index插入
            que.add(p[1], p);
        }
        return que.toArray(new int[people.length][]);
    }
}
