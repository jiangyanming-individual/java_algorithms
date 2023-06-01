package com.twice_LiKo.字符串;

/**
 * @author Lenovo
 * @date 2023/5/31
 * @time 21:25
 * @project java_算法
 **/
public class reverseStr_541 {
//    StringBuilder(线程不安全，但是速度快)和StringBuffer
    public String reverseStr(String s,int k){
        char[] chars = s.toCharArray();

        for (int i=0;i<chars.length;i+=(2 * k)){
            //如果小于2K 大于 k
            if (i+ k <=chars.length){
                //因为 i是从0开始的；
                swap(chars,i,i+k-1);
                continue;
            }else {
                //如果小于K 全部反转；
                swap(chars,i,chars.length-1);
            }
        }

        return new String(chars);
    }

    /**
     * 交换字符:
     * @param chars
     * @param i
     * @param j
     */
    void swap(char[] chars,int i ,int j){
        char temp;
        for (;i<j;i++,j--){
            temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
        }
    }

}
