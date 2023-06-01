package com.twice_LiKo.贪心;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Lenovo
 * @date 2023/5/4
 * @time 9:41
 * @project java_算法
 **/
public class partitionLabels_763 {


    public List<Integer> partitionLabels(String s){

        List<Integer> res=new ArrayList<>();
        int[] index_array = new int[26];
        //记录字母出现的最远的位置是
        for (int i=0;i<s.length();i++){
            index_array[s.charAt(i)-'a']=i;
        }

        int left=0;
        int right=0;
        for (int i=0;i<s.length();i++){
            right= Math.max(right,index_array[s.charAt(i)-'a']);

            if (i == right){
                int length=right -left +1;
                res.add(length);
                left=i+1;//更新左边界；
            }
        }
        return res;
    }
}
