package com.twice_LiKo.字符串;

/**
 * @author Lenovo
 * @date 2023/5/31
 * @time 22:09
 * @project java_算法
 **/
public class replaceSpace_offer05_02 {

    public String replaceSpace(String s){
        //使用StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<s.length();i++){
            if(s.charAt(i) == ' ') {
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(s.charAt(i));
            }
        }
        //从新转为String类型：
        return stringBuilder.toString();
    }
}
