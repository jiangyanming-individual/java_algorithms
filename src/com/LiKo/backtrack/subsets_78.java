package com.LiKo.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/3/7
 * @time 19:28
 * @project java_算法
 **/
public class subsets_78 {


    List<List<Integer>> res=new ArrayList<>();
    List<Integer> set=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums){

        backtracking(nums,0);
        return res;
    }

    public void backtracking(int[] nums,int startIndex){
        //这是将树的每个节点都加入到res种
        res.add(set);
        if (startIndex>=nums.length){
            return;
        }


        for (int i=startIndex;i<nums.length;i++){
            set.add(nums[i]);
            backtracking(nums,i+1);
            //回溯：
            set.remove(set.size()-1);
        }

    }
}
