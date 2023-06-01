package com.twice_LiKo.回溯算法;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/5/8
 * @time 9:13
 * @project java_算法
 **/
public class findSubsequences_491 {


    List<List<Integer>> res=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums){
        backTracking(nums,0);
        return res;
    }

    /**
     * 小于和等于path中最后一个值的都不能取
     * @param nums
     * @param startIndex
     */
    public void backTracking(int[] nums,int startIndex){

        //回溯终止条件：不可以return 因为需要取所有的树节点：
        if (path.size()>1){
            res.add(new ArrayList<>(path));
        }
        //去重的操作：
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=startIndex;i<nums.length;i++){

            //小于path中的值，直接跳过：
            if (!path.isEmpty() || nums[i]<path.get(path.size()-1)){
                continue;
            }

            //相等的值，不能直接跳过：
            if (map.getOrDefault(nums[i],0)>=1){
                continue;
            }

            //单层去重：如果当前元素不在hashmap中，直接直接加入到map中；
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            path.add(nums[i]);
            backTracking(nums,i+1);//递归
            path.remove(path.size()-1);//回溯；
        }

    }
}
