package com.twice_LiKo.数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * 剑指offer-29;
 */
public class spiralOrder_剑指offer_29 {
    public static void main(String[] args) {
        int [][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        spiralOrder(matrix);
    }

    public static int[] spiralOrder(int [][] matrix){

        //如果矩阵为空的话，直接返回一个空的数组：
        if (matrix== null || matrix.length==0){

            return new int[0];
        }

        int m = matrix.length;
        int n=matrix[0].length;
        //数组的长度：
        int top =0,bottom=m-1;
        int left=0,right=n-1;
        List<Integer> list = new ArrayList<>();
        while (list.size()< m * n){
            //从左上到右上
            if (top<=bottom){
                for (int j=left;j<=right;j++){
                    list.add(matrix[top][j]);
                }
                //top+;
                top++;
            }
            //从右上到右下
            if (left<=right){
                for (int i=top;i<=bottom;i++){
                    list.add(matrix[i][right]);
                }
                right--;
            }
            //从右下到左下；
            if (top<=bottom){
                for (int j=right;j>=left;j--){
                    list.add(matrix[bottom][j]);
                }
                bottom--;
            }

            //从左下到左上；
            if (left<=right){
                for (int i=bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        //list转为数组：
        int length= m * n;
        int[] res=new int[length];
        int index=0;
        for (Integer item : list) {
            res[index++]=item;
            System.out.print(item);
        }
        return res ;
    }
}
