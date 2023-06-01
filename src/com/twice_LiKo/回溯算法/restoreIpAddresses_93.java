package com.twice_LiKo.回溯算法;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/5/4
 * @time 9:05
 * @project java_算法
 **/
public class restoreIpAddresses_93 {

    List<String> res=new ArrayList<>();
    public List<String> restoreIpAddresses(String s){

        backTracking(s,0,0);
        return res;
    }


    public void backTracking(String s,int startIndex,int pointNum){
        //递归终止；
        if (pointNum == 3){
            //符合条件直接加入
            if (isValidStr(s,startIndex,s.length()-1)){
                res.add(s);
            }
            return;
        }
        //单层回溯条件：
        for (int i=startIndex;i<s.length();i++){
            //如果符合条件：
            if (isValidStr(s,startIndex,i)){
                s=s.substring(0,i+1)+"."+s.substring(i+1); //加入逗号； s.substring(i+1) 之前i+1之后的字符串；
                pointNum++;
                backTracking(s,i+2,pointNum); //回溯，因为加入冒号，所以原本i+1的位置变为i+2;
                pointNum--;
                s=s.substring(0,i+1)+s.substring(i+2);//去掉冒号
            }else{
                //不满足条件直接break;
                break;
            }
        }

    }
    public boolean isValidStr(String s,int start,int end){

        if(start>end){
            return false;
        }
        //是否含前导0
        if (s.charAt(start) =='0' && start!=end){
            return false;
        }

        int num=0;
        for (int i=start;i<=end;i++){
            //是否含非法数字
            if (s.charAt(i)>'9' || s.charAt(i)<'0'){
                return false;
            }
            //是否含大于255
            num=num * 10 +(s.charAt(i) - '0');

            if (num>255){
                return false;
            }
        }
        return true;
    }
}
