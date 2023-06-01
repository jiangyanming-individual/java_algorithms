package com.twice_LiKo.贪心;

import org.omg.PortableInterceptor.Interceptor;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.LinkedTransferQueue;

/**
 * @author Lenovo
 * @date 2023/4/6
 * @time 21:34
 * @project java_算法
 **/
public class findContentChildren_455 {


    public  static int findContentChildren(int[] g, int[] s){
        int res=0;
        //尽量用大饼干满足大胃口的孩子
        Arrays.sort(g);
        Arrays.sort(s); //升序排列；
        int s_index=s.length-1;

        for (int i=g.length-1;i>=0;i--){

            //从大胃口开始匹配；
            if (s_index>=0 && s[s_index]>= g[i]){
                res++;
                s_index--;//饼干减1;
            }
        }

        return res;
    }
}

//自定义比较器，降序
class MyCompare implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 -o1; //降序
    }
}
