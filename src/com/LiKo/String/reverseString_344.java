package com.LiKo.String;

/**
 * @author Lenovo
 * @date 2023/2/11
 * @time 21:28
 * @project java_算法
 **/
public class reverseString_344 {

    //以字符串数组的形式输入；
    public void reverseString(char[] s) {
        int middle=s.length/2;

        for (int i=0,j=s.length-1;i<middle;i++,j--){
                swap(s,i,j);
        }

    }
    public void swap(char[] s,int a,int b){
       char temp;
       temp=s[a];
       s[a]=s[b];
       s[b]=temp;
    }
}
