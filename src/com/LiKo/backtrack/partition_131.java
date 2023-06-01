package com.LiKo.backtrack;

import org.omg.CORBA.INTERNAL;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/3/6
 * @time 9:04
 * @project java_算法
 **/
public class partition_131 {


    List<List<String>> res=new ArrayList<>();
    List<String> path=new ArrayList<>();//分割的路径；
    public List<List<String>> partition(String s){

        backtracking(s,0);
        return res;
    }

    public void backtracking(String s,int startIndex){

        //递归终止条件：
        if (startIndex>=s.length()){
            //直接加入回文字符串；
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i=startIndex;i<s.length();i++){

           if (ishuiString(s,startIndex,i)){
               String str=s.substring(startIndex,i+1);//因为i+1// 是取不到的
               path.add(str);
           }else{
               //如果不算回文，直接跳过；
               continue;
           }
           //进行下一层递归
           backtracking(s,i+1);
           //回溯的过程；
           path.remove(path.size()-1);

        }
    }

    public boolean ishuiString(String s,int startIndex,int endIndex){

        //双指针法：
        int j=endIndex;
        for(int i=startIndex;i<endIndex;i++,j--){
            if (s.charAt(i) !=s.charAt(j)) {
                return false;
            }
        }
        return true;
    }


}
