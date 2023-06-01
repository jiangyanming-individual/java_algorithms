package com.twice_LiKo.回溯算法;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;
import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/5/8
 * @time 9:35
 * @project java_算法
 **/
public class permute_46 {


    List<List<Integer>> res=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    boolean [] used;
    public List<List<Integer>> permute(int[] nums){
        used=new boolean[nums.length];
        backTracking(nums);
        return res;
    }

    /**
     * 全排列问题，不需要startIndex；但是需要标记元素是否用过
     * @param nums
     */
    public void backTracking(int [] nums){

        //回溯终止条件：
        if (path.size() == nums.length){
            res.add(new ArrayList<>(path));
            return;
        }


        for (int i=0;i<nums.length;i++){
            //当前元素已经用过了
            if (used[i] == true){
                continue;
            }
            path.add(nums[i]);
            backTracking(nums);
            path.remove(path.size()-1);
            used[i]=false;
        }
    }
}
