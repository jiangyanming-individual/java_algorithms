package com.LiKo.贪心;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/3/13
 * @time 9:52
 * @project java_算法
 **/
public class partitionLabels_763 {

    public List<Integer> partitionLabels(String s){
        ArrayList<Integer> res_list = new ArrayList<>();
        int[] index_array=new int[26];

        char[] chars=s.toCharArray();//将字符串转为字符数组；
        for (int i=0;i<chars.length;i++){
            //更新最远字符的下标：将每个字符的最远index记录下来：
            index_array[chars[i]-'a']=i;
        }

        int left=0;
        int right=0;
        for (int i=0;i<chars.length;i++){
            //找到该区间最大的边界index；
            right=Math.max(right,index_array[chars[i]-'a']);
            if (i==right){
                //如果找到了最远下标：
                res_list.add(right-left+1);//将区间的长度加入到list
                left=i+1;//更新新的区间的左边界：left
            }
        }
        return res_list;
    }
}
