package com.twice_LiKo.回溯算法;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/5/6
 * @time 21:24
 * @project java_算法
 **/
public class subsetsWithDup_90 {

    /**
     * 就是在子集的基础上加了去重的逻辑：
     * 对同一树层进行去重的逻辑：
     * @param nums
     * @return
     */
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> set=new ArrayList<>();
    boolean [] used;
    public List<List<Integer>> subsetsWithDup(int [] nums){
        //去重问题先给nums排序：
        Arrays.sort(nums);
        used=new boolean[nums.length];//默认都为false

        if (nums.length == 0 || nums == null){
            res.add(new ArrayList<>(set));
            return  res;
        }
        backTracking(nums,0);
        return res;
    }
    public void backTracking(int [] nums, int startIndex){
        res.add(new ArrayList<>(set));
        //回溯终止条件：
        if (startIndex>=nums.length){
            return;
        }

        //单层回溯：
        for (int i=startIndex;i<nums.length;i++){
            //used[i-1] =True 是同一树枝用过；
            //used[i-1] =false 是同一层用过；
            if (i>0 && nums[i] == nums[i-1] && used[i-1] ==false){
                continue;
            }
            set.add(nums[i]);
            used[i]=true;
            backTracking(nums,i+1);//递归
            set.remove(set.size()-1);//回溯
            used[i]=false;
        }

    }

}
