package com.LiKo.贪心;

import java.util.Arrays;

/**
 * @author Lenovo
 * @date 2023/3/7
 * @time 20:22
 * @project java_算法
 **/
public class findContentChildren_455 {

    public int findContentChildren(int [] g,int[] s){

        Arrays.sort(g);
        Arrays.sort(s);

        int sum=0;
        int s_index=s.length-1;
        for (int i=g.length-1;i>=0;i--){

            if (s_index>=0 && s[s_index] >=g[i]){
                //如果饼干的下标大于等于0，并且饼干的量大于胃口的量；
                //如果饼干的量不大于胃口的大小；就将当前胃口大不满足条件的直接放去；然后直接遍历下一个人
                sum++;
                s_index--;
            }
        }
        return sum;
    }
}
