package com.twice_LiKo.字符串;

/**
 * @author Lenovo
 * @date 2023/5/29
 * @time 10:33
 * @project java_算法
 **/
public class reverseString_344 {

    public void reverseString(char[] s){

        int mid=s.length /2;
        for (int i=0,j=s.length-1;i<mid;i++,j--){
            swap(s,i,j);
        }
    }
    //交换两个字符：
    void swap(char[] s ,int i,int j){
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    }
}
