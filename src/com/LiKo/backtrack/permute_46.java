package com.LiKo.backtrack;

import org.omg.CORBA.INTERNAL;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/3/8
 * @time 15:12
 * @project java_算法
 **/
public class permute_46 {


    List<List<Integer>> res=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    boolean[] usered; //用来标记元素是不是被用过；
    public List<List<Integer>> permute(int[] nums){
        usered=new boolean[nums.length];
        backtracking(nums);
        return res;
    }

    public void backtracking(int[] nums){

        if (path.size() == nums.length){
            //取叶子节点
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i=0;i< nums.length;i++){

            if (usered[i] == true){
                //如果元素已经被用过了，就直接跳过；
                continue;
            }
            //标记已经用过了
            usered[i]=true;
            path.add(nums[i]);
            backtracking(nums);
            usered[i]=false;
            path.remove(path.size()-1);
        }
    }
}
