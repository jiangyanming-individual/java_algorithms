package com.twice_LiKo.回溯算法;

import java.util.*;

/**
 * @author Lenovo
 * @date 2023/5/9
 * @time 9:28
 * @project java_算法
 **/
public class findItinerary_332 {

    /**
     * hard
     * @param tickets
     * @return
     */

    List<String> res;
    List<String> path=new LinkedList<>();
    boolean[] used;
    public List<String>findItinerary(List<List<String>> tickets){
        //升序排序：
        Collections.sort(tickets,(a,b)-> a.get(1).compareTo(b.get(1)));
        used=new boolean[tickets.size()];
        path.add("JFK");
        backTracking(tickets);
        return res;
    }
    public boolean backTracking(List<List<String>> tickes){
        if (path.size() == tickes.size() +1){
            res=new LinkedList<>(path);//直接将path赋值给res
            return true;
        }
        //单层回溯
        for (int i=0;i<tickes.size();i++){
            //used数组是去重的操作；
            if (used[i] ==false && tickes.get(i).get(0).equals(path.get(path.size()-1))){
                path.add(tickes.get(i).get(1));

                used[i]=true;
                if (backTracking(tickes)){
                    //递归
                    return true;
                }
                //回溯：
                used[i]=false;
                path.remove(path.size()-1);
            }
        }
        return false;
    }
}
