package com.LiKo;

import java.security.cert.TrustAnchor;
import java.util.ArrayList;

/**
 * @author Lenovo
 * @date 2022/11/6
 * @time 20:21
 * @project java_workspace
 **/
public class Solution04 {
    public static boolean isValid(String s) {
        //创建一个arraylist的集合  lsit是接口
        ArrayList<Character> str_list = new ArrayList<>();

        if (s.length() % 2!=0)
            return false;
        if (s.length()==0)
            return true;

        for (int i = 0; i <s.length() ; i++) {

            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
                str_list.add(s.charAt(i));
            else if (s.charAt(i)==')' && str_list.size()!=0)
                if (str_list.get(str_list.size()-1)=='(')
                    str_list.remove(str_list.size()-1);//删除掉最后一个元素；
                else
                    return false;
            else if (s.charAt(i)==']' && str_list.size()!=0)
                if (str_list.get(str_list.size()-1)=='[')//判断最后一个元素是否是匹配的
                    str_list.remove(str_list.size()-1);
                else
                    return false;
            else if (s.charAt(i)=='}' && str_list.size()!=0)
                if (str_list.get(str_list.size()-1)=='{')
                    str_list.remove(str_list.size()-1);
                else
                    return false;
            else
                return false;
        }

        if (str_list.size()==0)
            return true;
        else
            return false;

    }
    public static String addBinary(String a, String b) {

        StringBuffer res = new StringBuffer();

        //获取a ,b 中最大的长度：
        int n=Math.max(a.length(),b.length());
        int carry=0;
        for (int i = 0; i <n ; i++) {
            carry+= i< a.length() ? (a.charAt(a.length()-1-i) - '0') : 0;//如果在范围中，就直接获取最后一个元素；
            carry+= i< b.length() ? (b.charAt(b.length()-1-i) - '0') : 0;

            int ans= carry % 2; //得到当前位的值：
            res.append( (char)(ans +'0') );//将数字变为字符 ，直接加入到stringbuffer中；

            carry /=2; //进位；

        }

        if(carry > 0)
            res.append('1'); //直接进位是1

        res.reverse();
        return res.toString();

    }

    public static int mySqrt(int x) {

        if (x==0){
            return 0;
        }
        if (x==1){
            return 1;
        }
        int left=1,res=-1;
        int right= x/2; //[right ,left]

        while (left<right){
            int mid = left + (right-left+1)/2;
            if (mid > x/mid ){//[left,mid-1]
                right=mid-1;
            }else {
                left=mid;//[mid ,right]
            }
        }
        return left;

    }
    public static void main(String[] args) {
        System.out.println(addBinary("11","1"));
    }
}
