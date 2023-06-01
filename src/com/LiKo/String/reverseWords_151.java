package com.LiKo.String;

import java.util.Arrays;

/**
 * @author Lenovo
 * @date 2023/2/13
 * @time 22:36
 * @project java_算法
 **/
public class reverseWords_151 {

    public String reverseWords(String s){

        //去除数组中的多余空格，
        char[] chars = s.toCharArray();
        chars=removeSpace(chars);

        //字符串翻转
        reverse(chars,0,chars.length-1);

        //单词翻转；
        reverseWords(chars);
        return new String(chars);
    }
    //移除多余的空格；
    public char[] removeSpace(char[] chars){

        int slow=0;
        for (int fast=0;fast< chars.length;fast++){

            if (chars[fast] !=' '){
                if (slow !=0){//此时遍历的不是第一个单词的时候
                    chars[slow++]=' ';
                }
                while (fast< chars.length && chars[fast]!=' ') {
                    chars[slow++]=chars[fast++];//fast和slow都同时前移1
                }

            }
        }
        char[] newchars = new char[slow];
        System.arraycopy(chars,0,newchars,0,slow);
        return newchars;
    }


    //翻转字符数组;左右指针来实现；
    public void reverse(char [] ch,int left,int right){

        while (left<right){
            ch[left] ^=ch[right];
            ch[right] ^=ch[left];
            ch[left] ^=ch[right];
            left++;
            right--;
        }
    }


    //翻转单词；以空格和chars.length为判断条件

    public void reverseWords(char[] chars){

        int start=0;
        for (int end=0;end<=chars.length;end++){
            if (end== chars.length || chars[end]==' '){
                reverse(chars,start,end-1);
                //一个单词翻转完后，start要移动到end+1，因为end最后一个是空格；
                start=end+1;
            }
        }
    }
}
