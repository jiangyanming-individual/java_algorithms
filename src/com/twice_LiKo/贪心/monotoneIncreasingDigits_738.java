package com.twice_LiKo.贪心;

/**
 * @author Lenovo
 * @date 2023/5/10
 * @time 9:59
 * @project java_算法
 **/
public class monotoneIncreasingDigits_738 {
    /**
     * 单调递增的数字：
     * @param n
     * @return
     */
    public int monotoneIncreasingDigits(int n){
        //从后往前遍历
        //数字转为String
        String str = String.valueOf(n);
        //start记录需要变为9的index
        int start=str.length();
        //将str转为char[] 数组；
        char[] chars = str.toCharArray();

        for (int i=chars.length-2;i>=0;i--){
            //如果前一个数比后一个数要打的话，前一个数减一，后一个数直接变为9
            if (chars[i]>chars[i+1]){
                chars[i]--;
                start=i+1;//记录需要变为9的下标；
            }
        }

        for (int i=start;i<chars.length;i++){
            chars[i]='9';
        }

        //先将chars数组转为String ,再转为int类型
        return Integer.parseInt(String.valueOf(chars));
    }
}
