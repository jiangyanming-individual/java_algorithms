package com.LiKo.贪心;

import javax.swing.*;

/**
 * @author Lenovo
 * @date 2023/3/14
 * @time 10:03
 * @project java_算法
 **/
public class monotoneIncreasingDigits_738 {


    public int monotoneIncreasingDigits(int n){
        //从后往前进行遍历，如果前一位大于后一位的数，就将前一位-1，后一位直接设置为9；

        //将int 类型数据转为 String
        String str= String.valueOf(n);
        int start=str.length(); //因为有可能，不需要改变；
        char[] chars = str.toCharArray();
        for (int i=chars.length-2;i>=0;i--){
            //i是从倒数第二个开始；
            if (chars[i]>chars[i+1]){
                chars[i]--; //前一位执行减一的操作；
                start=i+1;//记录需要变9的index
            }
        }

        for (int i=start;i<chars.length;i++){
            chars[i]='9';
        }
        //将字符串数组，转为String
        return Integer.parseInt(String.valueOf(chars));
    }

    public static void main(String[] args) {
        String res = chars_to_String();
        System.out.println("res的结果是："+res);
        System.out.println("res的类型是："+res.getClass());
    }
    public static String chars_to_String(){
        char[] chars=new char[10];
        for (int i=0;i<chars.length;i++){
            chars[i]='9';
        }
        //使用valueOf的形式：将字符数组转为字符串
        return String.valueOf(chars);
    }
}
