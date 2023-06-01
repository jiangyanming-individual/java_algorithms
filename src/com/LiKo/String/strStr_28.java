package com.LiKo.String;

/**
 * @author Lenovo
 * @date 2023/2/15
 * @time 21:41
 * @project java_算法
 **/
public class strStr_28 {

    public int strStr(String haystack, String needle) {

        int length=needle.length();
        if (length ==0)
            return 0;
        int[] next = new int[length];
        //获得next数组
        getNext(next,needle);
        int j=0;
        //进行两个字符串之间的匹配：
        for (int i=0;i<haystack.length();i++){

            //字符前后缀不匹配时，needle移动到next[j-1],就是当前元素的前一个位置；
            while (j> 0 && haystack.charAt(i) !=needle.charAt(j)){
                j=next[j-1];
            }
            //如果匹配的话，j后移动一位；
            if(haystack.charAt(i) == needle.charAt(j)){
                j++;
            }
            if (j==needle.length()){//如果移动到最后了匹配成功来返回，元素下标；
                return i-needle.length()+1;
            }

        }

        return -1;
    }
    public void getNext(int[] next,String s){

        //初始化
        int j=0;
        next[0]=j;
        //i 指向后缀， j指向前缀
        for (int i=1;i<s.length();i++){

            //前后字符串不相等的情况；j回退
            while (j>0 && s.charAt(i) !=s.charAt(j)){
                j=next[j-1];
            }
            //前后字符最长相等的时候
            if(s.charAt(i) == s.charAt(j)){
                j++;//j往后移；
            }
            next[i]=j;
        }
    }
}
