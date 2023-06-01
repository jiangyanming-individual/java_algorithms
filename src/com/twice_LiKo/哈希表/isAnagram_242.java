package com.twice_LiKo.哈希表;

/**
 * @author Lenovo
 * @date 2023/4/22
 * @time 8:02
 * @project java_算法
 **/
public class isAnagram_242 {

    /**
     * 使用哈希表的方法来做
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s,String t){

        int[] tables = new int[26];

        for (int i=0;i<s.length();i++){
            tables[s.charAt(i)-'a']++; //对应字符的个数加1；
        }

        for (int i=0;i<t.length();i++){
            tables[t.charAt(i)-'a']--;
        }

        for (int i=0;i<26;i++){
            if (tables[i]!=0){
                //如果字母的个数不相等，就直接返回false；
                return false;
            }
        }
        return false;
    }
}
