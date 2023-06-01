package com.twice_LiKo.回溯算法;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/4/21
 * @time 20:22
 * @project java_算法
 **/
public class combine_77_优化 {

    // [1,n]之间取数：
    List<List<Integer>> res_list=new ArrayList<>();
    List<Integer> path_list=new ArrayList<>();
    public List<List<Integer>> combine(int n,int k){
        backTracking(n,k,1);
        return res_list;
    }
    //1. 递归参数：
    void backTracking(int n,int k,int startIndex){
        //2.递归终止条件：
        if (path_list.size() == k){
            //如果path路径已经有了k个元素；就本次循环结束
            res_list.add(new ArrayList<>(path_list)); //注意要new 一个元素出来；
            return;
        }

        //3. 单层递归条件：
        //对条件进行剪枝的操作：
        for (int i=startIndex;i<=n-(k-path_list.size()) +1;i++){

            path_list.add(i);
            backTracking(n,k,i+1);//递归
            path_list.remove(path_list.size()-1);//回溯
        }
    }
}
