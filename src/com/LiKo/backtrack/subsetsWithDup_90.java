package com.LiKo.backtrack;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/3/8
 * @time 13:53
 * @project java_算法
 **/
public class subsetsWithDup_90 {

    List<List<Integer>> res=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    boolean [] usered;
    public List<List<Integer>> subsetsWithDup(int[] nums){
        Arrays.sort(nums);
        usered=new boolean[nums.length];//默认初始赋值为false；

        if (nums.length == 0){
            res.add(new ArrayList<>(path));
            return res;
        }
        backtracking(nums,0);
        return res;
    }
    //需要去重复的集合：
    public void backtracking(int[] nums ,int startIndex){

        res.add(new ArrayList<>(path));
        if (startIndex>=nums.length){
            return;
        }
        for (int i=startIndex;i< nums.length;i++){

            if (i>0 && nums[i] == nums[i-1] && usered[i-1] == false){
               continue;
            }
            usered[i]=true;
            backtracking(nums,i+1);
            usered[i]=false;
        }

    }
}
