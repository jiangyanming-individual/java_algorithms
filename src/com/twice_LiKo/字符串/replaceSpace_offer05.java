package com.twice_LiKo.字符串;

/**
 * 替换空格：
 */
public class replaceSpace_offer05 {


    public String replaceSpace(String s){


        if (s== null || s.length() == 0){
            return s;
        }

        //使用StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) == ' '){
                //空格扩充2个；
                stringBuilder.append("  ");
            }
        }
        //说明没有空格；
        if (stringBuilder.length() == 0){
            return s;
        }
        //左指针
        int left=s.length()-1;
        s+=stringBuilder.toString();
        //新组件的字符串：
        int right=s.length()-1;
        //遍历字符数组
        char[] chars = s.toCharArray();
        while (left>=0){
            if (chars[left] ==' '){
                chars[right--]='0';
                chars[right--]='2';
                chars[right--]='%';
                left--;
            }else {
                chars[right--] =chars[left--];
            }
        }

        //返回新的字符串：
        return new String(chars);
    }

}
