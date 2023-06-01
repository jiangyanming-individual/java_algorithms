package com.LiKo.backtrack;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/3/8
 * @time 14:20
 * @project java_算法
 **/
public class findSubsequences_49 {


    List<List<Integer>> res=new ArrayList<>();
    List<Integer> path=new ArrayList<>();

    public List<List<Integer>> findSubsequences(int[] nums){
        if (nums.length == 0){
            res.add(new ArrayList<>(path));
            return res;
        }
        backtracking(nums,0);
        return res;
    }


    public void backtracking(int[] nums,int startIndex){

        if (path.size()>1){
            res.add(new ArrayList<>(path));
            return;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i=startIndex;i<nums.length;i++){

            //如果path不为空 ,当前新加入的元素小于前一个加入path的元素
            //直接跳过该元素：
            if (!path.isEmpty() && nums[i] < path.get(path.size()-1)){
                continue;
            }

            //如果当前层的hashmap已经存在与当前元素相等的元素，就直接continue
            if (hashMap.getOrDefault(nums[i],0)>=1){
                continue;
            }
            //同一个父节点的孩子一层需要进行去重的操作：
            //如果当前元素不在hashmap中，就直接加入;
            hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
            path.add(nums[i]);
            backtracking(nums,i+1);
            path.remove(path.size()-1);

        }
    }
}
