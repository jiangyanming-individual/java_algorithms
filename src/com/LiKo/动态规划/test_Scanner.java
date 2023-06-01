package com.LiKo.动态规划;

import java.util.Scanner;

/**
 * @author Lenovo
 * @date 2023/3/15
 * @time 11:22
 * @project java_算法
 **/
public class test_Scanner {

    public static void main(String[] args) {
        int[] res= new int[3];
        Scanner scanner = new Scanner(System.in);
        int i=0;
        System.out.println("请输入数字：");
        //hasNextLine()是对字符串的输入进行的；
        if (scanner.hasNextLine()){
            String s = scanner.nextLine();
            System.out.println(s);
            System.out.println(s.getClass());
        }

    }
}
