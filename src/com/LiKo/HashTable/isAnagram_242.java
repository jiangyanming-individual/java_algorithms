package com.LiKo.HashTable;

import java.util.HashMap;

/**
 * @author Lenovo
 * @date 2023/2/10
 * @time 17:15
 * @project java_算法
 **/
public class isAnagram_242 {

    public static void main(String[] args) {
        isAnagram("abc","bac");
    }
    public static boolean isAnagram(String s, String t) {

        int[] hashtable=new int[26];//使用数组当作hash表

        for (int i = 0; i <26; i++) {
            System.out.println(hashtable[i]);
        }
        for (int i=0;i<s.length();i++){
            hashtable[s.charAt(i)-'a']++;
        }

        for (int j=0;j<t.length();j++){
            hashtable[t.charAt(j)-'a']--;
        }

        for (int i=0;i<26;i++){
            if (hashtable[i]!=0)
                return false;
        }
        return true;
    }

}
