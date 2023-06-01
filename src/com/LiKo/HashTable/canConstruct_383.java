package com.LiKo.HashTable;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Lenovo
 * @date 2023/2/11
 * @time 16:53
 * @project java_算法
 **/
public class canConstruct_383 {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] records = new int[26];

        ArrayList<Object> res = new ArrayList<>();

        res.size();

        if (ransomNote.length()>magazine.length())
            return false;
        for (int i=0;i<magazine.length();i++){
            records[magazine.charAt(i)-'a']++;
        }
        for (int j=0;j<ransomNote.length();j++){
            records[ransomNote.charAt(j)-'a']--;

            //如果由一个记录被减为负数了，就说明，magazize不够数
            if (records[ransomNote.charAt(j)-'a'] <0){
                return false;
            }
        }
        return true;
    }

}
