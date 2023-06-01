package com.LiKo.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/3/5
 * @time 12:40
 * @project java_算法
 **/
public class combinationSum2_40 {

    //组合中的路径需要去重(1,2,2) (2,1,2) (2,2,1)是一个组合；

    List<List<Integer>> res=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    boolean[] usered;
    public List<List<Integer>> combinationSum2(int[] candidates,int target){
        usered=new boolean[candidates.length];
        Arrays.fill(usered,false);//初始状态都设置为false；

        Arrays.sort(candidates);//对数组进行排序；
        backtracking(candidates,target,0,0);
        return res;
    }


    public void backtracking(int[] candidates,int target,int sum,int startIndex){
        if (sum>target){

            return;
        }
        if (sum == target){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i=startIndex;i<candidates.length;i++){

            if (i>0 && candidates[i] == candidates[i-1] && usered[i-1]==false){
                //usered[i-1] == false;说明没有用过；
                 continue;
            }
            usered[i]=true;//用过了
            sum+=candidates[i];
            path.add(candidates[i]);

            backtracking(candidates,target,sum,i+1);
            sum-=candidates[i];
            usered[i]=false;//没有用过；
            path.remove(path.size()-1);
        }

    }
}
