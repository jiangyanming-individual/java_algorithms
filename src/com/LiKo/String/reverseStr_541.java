package com.LiKo.String;

/**
 * @author Lenovo
 * @date 2023/2/12
 * @time 10:33
 * @project java_算法
 **/
public class reverseStr_541 {

    //操作字符串用StringBuffer 或者StringBuilder (线程不安全；)
    public String reverseStr(String s, int k) {
        char[] res=s.toCharArray();//先转换位字符数组

        for(int i=0;i<res.length;i+=(2*k)){
            //小于2k 但大于k，翻转前k个元素
            if (i + k <= res.length){
                swap(res,i,i+k-1);
                continue;
            }
            //小于k长度的，翻转全部的元素；
            swap(res,i,res.length-1);
        }


        return new String(res);
    }
    //翻转字符；
    public void  swap(char[] ch,int i,int j){
      for (;i<j;i++,j--){
            char temp;
            temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
      }

    }
}
