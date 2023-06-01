package com.twice_LiKo.回溯算法;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/4/20
 * @time 21:43
 * @project java_算法
 **/
public class combine_77 {


    List<List<Integer>> res_list=new ArrayList<>();
    List<Integer> path_list=new ArrayList<>();

    public List<List<Integer>> combine(int n,int k){
        backTracking(n,k,1);
        return res_list;
    }
    //1.递归参数
    void  backTracking(int n,int k,int startIndex){
        //2. 递归终止条件；
        if (path_list.size() == k){
            //如果组合数 == k
            res_list.add(new ArrayList<>(path_list)); //新得到一个ArrayList()
            return;
        }

        //3. 单层递归：
        for (int i=startIndex;i<=n;i++){
            path_list.add(i); //处理节点；
            backTracking(n,k,i+1); //递归；
            path_list.remove(path_list.size()-1);//回溯
        }
    }
}
