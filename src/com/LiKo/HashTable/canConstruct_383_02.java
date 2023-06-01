package com.LiKo.HashTable;

/**
 * @author Lenovo
 * @date 2023/2/21
 * @time 19:36
 * @project java_算法
 **/
public class canConstruct_383_02 {

    public boolean canConstruct(String ransomNote, String magazine) {

        int[] res = new int[26];
        if (ransomNote.length() > magazine.length())
            return false;

       for (int i=0;i<magazine.length();i++){
           res[magazine.charAt(i)-'a']++;
       }

       for (int j=0;j<ransomNote.length();j++){

           res[ransomNote.charAt(j)-'a']--;//如果res中有对应元素就继续减
           if (res[ransomNote.charAt(j)-'a'] <0){ //如果res中有元素的值小于0了，直接返回false
               return false;
           }
       }
        return true;
    }
}
