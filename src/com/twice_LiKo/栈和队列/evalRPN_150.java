package com.twice_LiKo.栈和队列;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Lenovo
 * @date 2023/4/19
 * @time 8:03
 * @project java_算法
 **/
public class evalRPN_150 {

    public int evalRPN(String [] tokens){
        Deque<Integer> stack = new LinkedList<>();

        for (int i=0;i< tokens.length;i++){
            //如果遇到运算符就进行运算：
            String token=tokens[i];
            int num1,num2;
            if (token.equals("+")){
                num1=stack.poll();
                num2=stack.poll();
                stack.push(num1+num2);
            }else if(token.equals("-")){
                num1=stack.poll();
                num2=stack.poll();
                stack.push(num2-num1);
            }else if(token.equals("*")){
                num1=stack.poll();
                num2= stack.poll();
                stack.push(num1 * num2);
            }else if(token.equals("/")){
                num1=stack.poll();
                num2=stack.poll();
                stack.push(num2 / num1);
            }else{
                //是数字直接加入
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        //得到最终的数：
        return stack.poll();
    }
}
