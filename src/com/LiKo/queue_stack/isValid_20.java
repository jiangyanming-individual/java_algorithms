package com.LiKo.queue_stack;

import java.util.Stack;

/**
 * @author Lenovo
 * @date 2023/2/20
 * @time 19:22
 * @project java_算法
 **/
public class isValid_20 {

    public static boolean isValid(String s) {


        Stack<Character> charstack = new Stack<>();
        if(s.length() == 0)
            return true;
        if(s.length()%2 !=0)
            return false;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                charstack.push(')'); //如果是左括号的话，就直接右括号进栈；
            }else if(s.charAt(i) == '['){
                charstack.push(']');
            }else if(s.charAt(i) == '{'){
                charstack.push('}');
            }else if(charstack.isEmpty() || charstack.peek() != s.charAt(i)) {
                return false;
            }else{
                charstack.pop();//如果栈顶元素和当前的元素匹配的话，就直接出栈；
            }
        }
        if (!charstack.isEmpty()){
            return false;
        }
        return true;
    }

}
