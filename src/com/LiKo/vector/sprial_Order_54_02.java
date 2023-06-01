package com.LiKo.vector;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/2/4
 * @time 15:54
 * @project java_算法
 **/
public class sprial_Order_54_02 {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res = new ArrayList<>();
        int m= matrix.length;
        int n=matrix[0].length;
        int upper=0,lower=m-1;//设置上下边界
        int left=0,right=n-1;//设置左右边界


        //res.size() == m * n 时就退出了
        while (res.size() < m * n){
            //从左上往右上；
            if(upper<=lower){
                for(int j=left;j<=right;j++){
                    res.add(matrix[upper][j]);
                }
                upper++;//upper边界减一；
            }
            //从右上往右下；
            if(left<=right){
                for(int i=upper;i<=lower;i++){
                    res.add(matrix[i][right]);
                }
                right--;//右边界减1；
            }

            //从右下往左下；
            if(upper<=lower){
                for(int j=right;j>=left;j--){
                    res.add(matrix[lower][j]);
                }
                lower--;//下边界减一；
            }
            //从右下往左下；
            if(left<=right){
                for(int i=lower;i>=upper;i--){
                    res.add(matrix[i][left]);
                }
                left++;//左边界加1；
            }
        }
        return res;
    }
}
