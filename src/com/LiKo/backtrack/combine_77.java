package com.LiKo.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/3/4
 * @time 10:47
 * @project java_算法
 **/
public class combine_77 {

    //回溯问题中的组合问题

    List<List<Integer>> res ;
    //添加路径：
    ArrayList<Integer> path ;
    public List<List<Integer>> combine(int n,int k){
        res=new ArrayList<>();
        path=new ArrayList<>();
        backTracking(n,k,1);
        return res;
    }

    public void backTracking(int n,int k ,int startIndex){
        //递归终止条件：
        if (path.size()==k){
            //满足条件的路径直接返回,k个数决定递归的深度
            res.add(path);//符合条件的直接加入
            return;
        }
        //单层递归的条件：
        for (int i=startIndex;i<=n;i++){
            //n 个数的集合决定树的宽度；

            path.add(i);//加入元素；
            backTracking(n,k,i+1);//递归；下一个元素；
            path.remove(path.size()-1);//回溯；删除最后一个加的元素，再进行递归
        }
    }
}
