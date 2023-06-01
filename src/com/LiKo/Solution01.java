package com.LiKo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2022/11/1
 * @time 9:58
 * @project java_workspace
 **/
public class Solution01 {

    /*
    *
    *杨辉三角
    **/
    public static List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i <numRows ; i++) {

            ArrayList<Integer> rows = new ArrayList<>();
            for (int j = 0; j <=i ; j++) {
                if (j == 0 || j == i) {
                    rows.add(1);
                } else {
                    rows.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                }
            }
            res.add(rows);
        }
//        System.out.println(res)
        return res;
    }
    public static List<Integer> getRow(int rowIndex) {
        ArrayList<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i <=rowIndex ; i++) {
            List<Integer> rows = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    rows.add(1);
                } else {
                    rows.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                }
            }

            res.add(rows);

        }
        return res.get(rowIndex);


    }
    public static void main(String[] args) {
        System.out.println(generate(5));
        System.out.println(getRow(3));
    }


}



