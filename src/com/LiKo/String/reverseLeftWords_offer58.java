package com.LiKo.String;

/**
 * @author Lenovo
 * @date 2023/2/15
 * @time 21:27
 * @project java_算法
 **/
public class reverseLeftWords_offer58 {

    public String reverseLeftWords(String s, int n) {

        //首先翻转前n个元素
        char[] chars = s.toCharArray();
        reverse(chars,0,n-1);

        //其次翻转n到末尾的元素
        reverse(chars,n,chars.length-1);
        //整体翻转元素；
        reverse(chars,0,chars.length-1);
        return new String(chars);
    }


    public void reverse(char[] chars ,int start, int end){
        while (start < end){
            chars[start] ^=chars[end]; //a= a^b
            chars[end] ^=chars[start]; //b = b^ a^ b===>a
            chars[start] ^=chars[end]; // a= a^b ^b ===>a

            start++;
            end--;
        }
    }
}
