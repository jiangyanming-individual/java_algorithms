package com.LiKo.queue_stack;

import java.util.Stack;

/**
 * @author Lenovo
 * @date 2023/2/21
 * @time 8:38
 * @project java_算法
 **/
public class evalRPN_150 {


    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        for(int i=0;i< tokens.length;i++){
            //如果是操作符的话就直接弹出栈顶的两个元素，再将运算的结果加入到栈中；
                String token=tokens[i];
                int num1,num2;
                if(token.equals("+")){
                    num1= stack.pop();
                    num2=stack.pop();
                    stack.push(num1 + num2);
                }else if(token.equals("-")){
                    num1=stack.pop();
                    num2=stack.pop();
                    stack.push(num2-num1);
                }else if(token.equals("*")){
                    num1=stack.pop();
                    num2=stack.pop();
                    stack.push(num1 * num2);
                }else if (token.equals("/")){
                    num1=stack.pop();
                    num2=stack.pop();
                    stack.push(num2 / num1);
                }else{
                stack.push(Integer.parseInt(token)); //如果是数字的话转为整形后就直接加入栈中；
                }

        }
        return stack.pop(); //直接弹出栈中的最后一个元素；
    }

    public static void main(String[] args) {
        String[] res=new String[1];
        res[0]="23";
        System.out.println(res[0].getClass());
    }

}

