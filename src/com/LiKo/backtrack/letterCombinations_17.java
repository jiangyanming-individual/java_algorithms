package com.LiKo.backtrack;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/3/5
 * @time 10:34
 * @project java_算法
 **/
public class letterCombinations_17 {

    //定义一个全局变量用来存放结果
    List<String> res=new ArrayList<>();
    //定义一个StringBuilder来进行字符的操作，然后转为字符串；
    StringBuilder path=new StringBuilder();
    public List<String> letterCombinations(String digits){

        String[] numString={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtracking(digits,numString,0);//下标从0开始
        return res;
    }
    //index是当前数字的下标
    public void backtracking(String digits,String[] numString,int index){
        if (index == digits.length()){
            //遍历到最后一个元素的下一个元素了就直接退出了
            res.add(path.toString());//将路径加入到结果集中
            return;
        }
        //2对应的 abc字符串
        String str=numString[digits.charAt(index)-'0'];//取每个数字字符对应的字符串

        //树的宽度是数字对应的字符长度；对应的深度是有多少数组；
        for (int i=0;i<str.length();i++){
            //一个数中字符的长度
            path.append(str.charAt(i));//在路径中加入字符；
            backtracking(digits,numString,index+1);//递归下一个数字；
            path.deleteCharAt(path.length()-1);//删除最后一个元素；
        }
    }
}
