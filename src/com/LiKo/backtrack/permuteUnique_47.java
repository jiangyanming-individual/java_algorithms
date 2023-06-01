package com.LiKo.backtrack;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/3/8
 * @time 15:44
 * @project java_算法
 **/
public class permuteUnique_47 {

    List<List<Integer>> res=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    boolean[] usered;//控制外层的元素是不是复用；
    public List<List<Integer>> permuteUnique(int[] nums){
        Arrays.sort(nums);//首先对数组进行排序；
        usered=new boolean[nums.length];
        backtracking(nums);
        return res;
    }

    public void backtracking(int[] nums){

        if (path.size() == nums.length){
            //到达叶子节点就直接return
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i=0;i< nums.length;i++){

            //同一层的元素进行去重的操作：
            if (i>0 && nums[i] == nums[i-1] && usered[i-1] == false){
                //usered[i-1]是从左边回溯过来的，所以设置为false
                continue;
            }
            if (usered[i] == true){
                //如果当前元素已经取过来，也continue
                continue;
            }

            if(usered[i] == false){
                usered[i]=true;
                path.add(nums[i]);
                backtracking(nums);//递归
                usered[i]=false;//回溯
                path.remove(path.size()-1);
            }
        }

    }
}
