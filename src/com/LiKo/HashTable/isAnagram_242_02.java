package com.LiKo.HashTable;

/**
 * @author Lenovo
 * @date 2023/2/20
 * @time 18:10
 * @project java_算法
 **/
public class isAnagram_242_02 {

    public boolean isAnagram(String s, String t) {

        int record[]=new int[26];

        for(int i=0;i<s.length();i++){
            record[s.charAt(i) - 'a']+=1;
        }

        for (int j=0;j<t.length();j++){
            record[t.charAt(j)-'a']-=1;
        }
        for (int i=0;i<26;i++){
            if (record[i]!=0)
                return false;
        }
        return true;
    }
}
