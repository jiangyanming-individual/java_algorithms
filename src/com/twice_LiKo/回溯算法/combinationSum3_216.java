package com.twice_LiKo.回溯算法;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/4/21
 * @time 20:36
 * @project java_算法
 **/
public class combinationSum3_216 {

    //有k个数之和为 n [1,9]
    List<List<Integer>> res_list=new ArrayList<>();
    List<Integer> path_list =new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k,int n){
        int sum=0;
        backTracking(k,n,sum,1);
        return res_list;
    }

    void backTracking(int k,int n,int sum,int startIndex){
        //递归出口：不满足条件的时候，
        if (sum > n)return;

        //满足条件的时候：
        if (path_list.size() == k){
            if (sum == n){
                //如果满足总和等于n;加入组合；
                res_list.add(new ArrayList<>(path_list));
            }
            return;//递归出口
        }

        //单层递归：
        for (int i=startIndex;i<= 9 -(k-path_list.size())+1;i++){
            sum+=i;
            path_list.add(i);
            backTracking(k,n,sum,i+1);//递归
            sum-=i;
            path_list.remove(path_list.size()-1);//回溯，移除最后一个元素；
        }
    }
}
