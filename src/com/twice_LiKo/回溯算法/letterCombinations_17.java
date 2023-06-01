package com.twice_LiKo.回溯算法;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/4/21
 * @time 20:51
 * @project java_算法
 **/
public class letterCombinations_17 {
    //定义list来保存结果：
    List<String> res_list=new ArrayList<>();
    //用来保存组合；
    StringBuilder builder=new StringBuilder();

    public List<String> letterCombinations(String digits){
        if (digits.length() == 0 || digits ==null)return res_list;
        String[] numString={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        backTracking(digits,numString,0);
        return res_list;
    }
    void backTracking(String digits,String [] numString,int index){

        //递归终止条件：index控制数字的下标。下标要等于最后一个元素的下一个元素；
        if (index == digits.length()){
            //如果遍历到最后一个字符了的下一个元素了,加入到结果集中；
            res_list.add(builder.toString());
            return;
        }
        //找到 数字对应的字符串：
        String str=numString[digits.charAt(index) -'0']; //numString对应的下标；
        //单层递归的条件：遍历字符串：
        for (int i=0;i<str.length();i++){
            builder.append(str.charAt(i));
            backTracking(digits,numString,index+1); //向下递归；
            builder.deleteCharAt(builder.length()-1);//回溯 ；删除最后一个加入的元素；
        }

    }
}
