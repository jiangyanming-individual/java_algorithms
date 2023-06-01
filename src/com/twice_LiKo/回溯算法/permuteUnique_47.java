package com.twice_LiKo.回溯算法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/5/9
 * @time 9:18
 * @project java_算法
 **/
public class permuteUnique_47 {

    /**
     * 对于排列问题，得到的结果是树的叶子节点;这次是需要对树层进行去重的操作
     * @param nums
     * @return
     */
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    boolean[] used;
    public List<List<Integer>> permuteUnique(int[] nums){
       Arrays.sort(nums);//先对nums排序；
       used=new boolean[nums.length];
       backTracking(nums);
       return res;
    }

    public void backTracking(int[] nums){

        //递归终止条件
        if (path.size() == nums.length){

            res.add(new ArrayList<>(path));
            return;
        }
        for (int i=0;i< nums.length;i++){
            if (i>0 && nums[i] == nums[i-1] && used[i-1] == false){
                continue;//树层的树重复；
            }

            if (used[i] == false){
                //同一树枝去重：
                used[i]=true;
                path.add(nums[i]);
                backTracking(nums);
                used[i]=false;
                path.remove(path.size()-1);
            }
        }
    }
}
