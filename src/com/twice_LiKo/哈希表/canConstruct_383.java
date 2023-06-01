package com.twice_LiKo.哈希表;

import com.sun.org.apache.bcel.internal.generic.FADD;

/**
 * @author Lenovo
 * @date 2023/4/25
 * @time 9:12
 * @project java_算法
 **/
public class canConstruct_383 {


    public boolean canConstruct(String ransomNote,String magazine){

        int[] res=new int[26];
        if (ransomNote.length()>magazine.length()){
            return false;
        }

        for (int i=0;i<magazine.length();i++){
            res[magazine.charAt(i)-'a']++;
        }

        for (int i=0;i<ransomNote.length();i++){
            res[ransomNote.charAt(i)-'a']--;
            if (res[ransomNote.charAt(i)-'a']<0){
                //判读数组中的数值是不是小于0；
                return false;
            }
        }
        return true;
    }
}
