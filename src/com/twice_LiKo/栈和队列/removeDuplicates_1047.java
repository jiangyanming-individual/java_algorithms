package com.twice_LiKo.栈和队列;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Lenovo
 * @date 2023/4/18
 * @time 8:54
 * @project java_算法
 **/
public class removeDuplicates_1047 {

    public String removeDuplicates(String s){

        Deque<Character> stack = new LinkedList<>();
        if (s.length() == 0){
            return null;
        }
        for (int i=0;i<s.length();i++){

            if (stack.isEmpty() || stack.peek()!=s.charAt(i)){
                //如果栈为空，或者栈头和当前的字符不相等，就直接入栈；
                stack.push(s.charAt(i));
            }else{
                //相等的情况出栈；
                stack.poll();
            }
        }

        //拼接字符串
        String res="";
        while (!stack.isEmpty()){

            res=stack.poll()+res;
        }

        return res;
    }
}
