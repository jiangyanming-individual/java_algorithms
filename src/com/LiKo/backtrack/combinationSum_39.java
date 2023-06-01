package com.LiKo.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/3/5
 * @time 12:03
 * @project java_算法
 **/
public class combinationSum_39 {

    List<List<Integer>> res=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates,int target){

        backtracking(candidates,target,0,0);
        return res;
    }

    //回溯
    //sum求在当前路劲下的节点之和，
    public void backtracking(int[] candidates,int target,int sum,int startIndex){

        if (sum>target){
            return;
        }
        if (sum == target){

            //如果是当前路径符合条件的话，就直接加入
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i =startIndex;i< candidates.length;i++){
            path.add(candidates[i]);
            sum+=candidates[i];
            //进行递归
            backtracking(candidates,target,sum,i+1);

            //进行回溯；
            sum-=candidates[i];
            path.remove(path.size()-1);

        }
    }
}
