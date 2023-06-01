package com.twice_LiKo.字符串;

/**
 * 反转字符串中的单词：
 */
public class reverseWords_151 {

    public String reverseWords(String s){
        char[] chars = s.toCharArray();
        //移除多余的空格；
        char[] newChar = removeSpace(chars);
        //反转整个字符串：left<right;
        reverseString(newChar,0,newChar.length-1);

        //反转单个单词
        reverseWords(newChar);

        return new String(newChar);
    }
    /**
     * 移除空格：
     * @param chars
     * @return
     */
    public char[] removeSpace(char[] chars){

        int slow=0;
        for (int fast=0;fast<chars.length;fast++){

            if (chars[fast]!=' '){
                if (slow!=0){
                    //当前遍历的不是第一个单词;将每个单词之间加入一个空格：
                    chars[slow++]=' ';
                }
                //当前遍历的是单词：
                while (fast< chars.length && chars[fast]!=' '){
                    chars[slow++]=chars[fast++];
                }
            }
        }
        //slow是新的字符数组的长度：
        char[] newChars=new char[slow];
        System.arraycopy(chars,0,newChars,0,slow);
        return newChars;
    }

    /**
     * 翻转字符串
     * @param chars
     * @param left
     * @param right
     */
    public void reverseString(char[] chars,int left,int right){
        while (left<right){
            //位运算
            chars[left]^=chars[right];
            chars[right]^=chars[left];
            chars[left]^=chars[right];
            left++;
            right--;
        }
    }
    /**
     * 反转单个单词：
     * @param chars
     */
    public void reverseWords(char[] chars){
        int start=0,end=0;
        //end必须指向单词的下一个位置
        for (end=0;end<=chars.length;end++){
            //只有当end == 字符串的长度 ，或者end是空格时，说明遍历完了一个单词：
            if (end == chars.length || chars[end] == ' '){
                reverseString(chars,start,end-1);

                //反转一个字符串 要将start 前移到end+1的位置；end
                start=end+1;
            }
        }
    }
}
