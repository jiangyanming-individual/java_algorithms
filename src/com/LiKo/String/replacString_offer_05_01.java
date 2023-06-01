package com.LiKo.String;

/**
 * @author Lenovo
 * @date 2023/2/12
 * @time 11:42
 * @project java_算法
 **/
public class replacString_offer_05_01 {
    public String replaceSpace(String s) {

        StringBuilder res = new StringBuilder();
        for (Character ch:s.toCharArray()) {
            if (ch==' '){
                res.append("%20");
            }else{
                res.append(ch);
            }
        }
        //StringBuilder 转为String类型；
        return res.toString();
    }
}
