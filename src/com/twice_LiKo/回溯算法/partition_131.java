package com.twice_LiKo.回溯算法;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/4/23
 * @time 19:31
 * @project java_算法
 **/
public class partition_131 {

    List<List<String>> res=new ArrayList<>();
    List<String> path=new ArrayList<>();
    public List<List<String>> partition(String s) {
        backTracking(s,0);
        return res;
    }
    //1.递归参数：
    void backTracking(String s,int startIndex){
        //2. 递归终止条件：
        if (startIndex>=s.length()){
            //终止条件：加入回文数；
            res.add(new ArrayList<>(path));
            return;
        }
        //3.单层递归：
        for (int i=startIndex;i<s.length();i++){
            if (ishuiString(s,startIndex,i)){
                //判断是不是回文：如果是直接加入路径
                String subString=s.substring(startIndex,i+1);//i+1取不到；
                path.add(subString);
            }else{
                //如果不是回文直接跳过
                continue;
            }
            //进行下一层递归
            backTracking(s,i+1);
            //回溯的过程：
            path.remove(path.size()-1);
        }


    }
    public boolean ishuiString(String str,int startIndex,int endIndex){

        //判断是不是回文数：
        int j=endIndex;
        for (int i=startIndex;i<endIndex;i++,j--){
            if (str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }
}