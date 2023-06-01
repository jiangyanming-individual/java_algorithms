package com.LiKo.String;



/**
 * @author Lenovo
 * @date 2023/2/12
 * @time 13:53
 * @project java_算法
 **/
public class replacString_offer_05_02 {
    public String replaceSpace(String s) {

        if(s== null || s.length() ==0)
            return s;

        StringBuilder str = new StringBuilder();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) == ' '){
                str.append("  ");
            }
        }

        if (str.length() ==0)//没有空格；直接返回s
            return s;

        int left=s.length()-1;//设置 左指针；
        s+=str.toString(); //拼接成新的字符串；
        int right=s.length()-1;//   右指针指向拼接字符串后的末尾元素


        char[] ch = s.toCharArray();
        while (left>=0){
            if (ch[left] == ' '){//更改字符串的末尾元素的值；
                ch[right--]='0';
                ch[right--]='2';
                ch[right]='%';
            }else {
                ch[right]=ch[left];
            }
            //双指针同时向后移动；
            left--;
            right--;
        }
        return new String(ch);//将char数组转为 String类型；
    }

}

