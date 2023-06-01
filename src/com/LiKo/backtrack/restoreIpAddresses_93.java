package com.LiKo.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/3/6
 * @time 9:50
 * @project java_算法
 **/
public class restoreIpAddresses_93 {
    List<String> res=new ArrayList<>();
    public List<String> restoreIPAddress(String s){

        backtracking(s,0,0);//startIndex和 pointNums都是从0开始的
        return res;
    }
    //进行回溯的过程
    public void backtracking(String s,int startIndex,int pointNUms){

        if(pointNUms == 3){
            //符合条件，可以直接加入到res中；
            if(isValid(s,startIndex,s.length()-1)){
                res.add(s);
            }
            return;
        }
        for(int i=startIndex;i<s.length();i++){
            if (isValid(s,startIndex,i)) {
                //判断新加入的字符串是不是符合；       substring(0,i+1)       i+1位置取不到；
                s = s.substring(0, i + 1) + "." + s.substring(i + 1);//加入逗号；s.substring(i+1)是i+后面的字符串
                pointNUms++;
                backtracking(s, i + 2, pointNUms);//因为加入了冒号；，所以index要往后移动一位；
                //回溯的过程
                pointNUms--;
                s = s.substring(0, i + 1) + s.substring(i + 2);//去掉逗号；
            }else{
                break;
            }
        }
    }
    //进行合法字符判断的过程：
    public boolean isValid(String s,int start,int end){

        if(start > end){
            return false;
        }
        //如果遇到前导0
        if (s.charAt(start) == '0' && start!=end){
            return false;
        }
        int num=0;
        for(int i=start;i<=end;i++){
            //遇到非法的字符，
            if(s.charAt(i) >'9' || s.charAt(i)<'0'){
                return false;
            }
            num=num * 10 +(s.charAt(i) -'0');
            //如果数字大于255，不合法；
            if(num>255){
                return false;
            }
        }
        return true;
    }
}
