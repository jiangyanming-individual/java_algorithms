package com.LiKo.queue_stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Lenovo
 * @date 2023/2/20
 * @time 21:39
 * @project java_算法
 **/
public class removeDuplicates_1047 {

    public String removeDuplicates(String s) {

        //新建一个栈；
        Stack<Character> StringStack = new Stack<>();

        if (s.length() == 0)
            return null;

        for (int i=0;i<s.length();i++){
            if (StringStack.isEmpty() || StringStack.peek()!=s.charAt(i)){
                StringStack.push(s.charAt(i));
            }else{
                StringStack.pop();
            }

        }
        String str="";
        while (!StringStack.isEmpty()){
            str=StringStack.pop()+str; //字符串拼接；
        }
        return str;
    }
}
