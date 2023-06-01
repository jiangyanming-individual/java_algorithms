package com.LiKo.queue_stack;

/**
 * @author Lenovo
 * @date 2023/2/21
 * @time 10:43
 * @project java_算法
 **/
public class test {

    public static void main(String args[]) {
        String str = "helloworld";
        char[] res = str.toCharArray();// 将字符串转为数组
        for (int i = 0; i < res.length; i++) {
            //小写字符
            System.out.print(res[i] + "  ");
            res[i] -= 32; //字符小写转为大写
            //大写字符
            System.out.print(res[i] + "  ");
            System.out.println();
        }
        System.out.println(new String(res));//将得到的字符数组转为字符串的格式。
    }
}