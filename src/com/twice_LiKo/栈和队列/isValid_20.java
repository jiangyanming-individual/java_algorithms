package com.twice_LiKo.栈和队列;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Lenovo
 * @date 2023/4/17
 * @time 8:42
 * @project java_算法
 **/
public class isValid_20 {

    public  boolean isValid(String s){

        Deque<Character> stack = new LinkedList<Character>();

        if (s.length()==0){
            return true;//空字符串也正确；
        }
        if (s.length() % 2!=0){
            return false;//奇数字符串直接false;
        }
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) == '('){
                //遇到左括号，将相匹配的右括号入栈；方便进行比较
                stack.push(')');
            }else if (s.charAt(i) == '['){
                //遇到左括号，将相匹配的右括号入栈；方便进行比较
                stack.push(']');
            }else if (s.charAt(i) == '{'){
                //遇到左括号，将相匹配的右括号入栈；方便进行比较
                stack.push('}');
            }else if (stack.isEmpty() || stack.peek() != s.charAt(i)) {
                //2 遇到不匹配的括号；
                //3 ：字符串没有遍历完，栈为空了，说明右括号多了
                return false;
            }else {
                //遇到相匹配的括号；栈头出栈；
                stack.poll();
            }
        }

        if (!stack.isEmpty()){
            //遍历完字符串，然后栈还不为空的话，说明左括号多了；
            return false;
        }

        //满足条件的字符串：
        return true;
    }
}
