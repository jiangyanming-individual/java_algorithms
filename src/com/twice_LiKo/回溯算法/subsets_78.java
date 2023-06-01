package com.twice_LiKo.回溯算法;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/5/6
 * @time 21:03
 * @project java_算法
 **/
public class subsets_78 {


    List<List<Integer>> res=new ArrayList<>();
    List<Integer> set=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums){
        backTracking(nums,0);
        return res;
    }

    /**
     * 子集问题是要求取到树的每个节点：
     * @param nums
     * @param startIndex
     */
    public void  backTracking(int[] nums,int startIndex){
        //子集问题是将树的每个节点都加入到set中；
        res.add(new ArrayList<>(set));
        //回溯终止条件：
        if (startIndex>=nums.length){
            return;
        }

        //单层回溯：
        for (int i= startIndex ;i<nums.length;i++){
            set.add(nums[i]);
            //递归
            backTracking(nums,i+1);
            //回溯：
            set.remove(set.size()-1);
        }

    }
}
