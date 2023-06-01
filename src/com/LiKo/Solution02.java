package com.LiKo;

import java.util.ArrayList;

/**
 * @author Lenovo
 * @date 2022/11/1
 * @time 10:25
 * @project java_workspace
 **/
public class Solution02 {
    public static boolean isPalindrome(String s) {

        int length = s.length();
        StringBuffer sb = new StringBuffer();
        if (s.equals(" ")){
            return true;
        }
        for (int i = 0; i <length ; i++) {

            if (s.charAt(i) >='A' && s.charAt(i)<='Z'){
                sb.append((char)(s.charAt(i)+32));
            }
            else if((s.charAt(i) >='a' && s.charAt(i)<='z') || s.charAt(i) >='0' &&s.charAt(i)<='9'){
                sb.append(s.charAt(i));//stringbuffer 转 string类型；
            }

        }

        int sb_length= sb.length()-1;//下标从0开始；
        int s_index=0;
        while (s_index < sb_length){
            if(sb.charAt(s_index)!=sb.charAt(sb_length)){
                return false;
            }
            s_index++;
            sb_length--;

        }
        
        return true;

    }


    public static void main(String[] args) {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
