package com.LiKo.vector;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/2/4
 * @time 10:35
 * @project java_算法
 **/
public class spiralOrder_54 {

    //
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> numerlist = new ArrayList<>();
        int m= matrix.length;//返回行数；
        int n= matrix[0].length;//得到列数
        int startx=0,starty=0;
        int i,j;
        int loop=0;//设置循环次数；
        int count=1;
        int offset=1;

        if(m==1){
            for (j=starty;j<n;j++){
                numerlist.add(matrix[startx][j]);
            }
        }

        //如果m==n的情况下
        if(m==n){
            while (loop++< m/2){
                //从左上到右上；行不动；
                for(j=starty;j< m-offset;j++){
                    numerlist.add(matrix[startx][j]);
                }

                //从右上到右下；列不动；
                for(i=startx;i< m-offset;i++){
                    numerlist.add(matrix[i][j]);
                }
                //从右下到左下； 行不动，列动
                for(;j>starty;j--){
                    numerlist.add(matrix[i][j]);
                }
                //从左下到左上；
                for(;i>startx;i--){
                    numerlist.add(matrix[i][j]);
                }
                startx++;
                starty++;
                offset++;
            }
            if(m%2 !=0){
                numerlist.add(matrix[startx][startx]);
            }

        }
        //如果m=！n的情况下
        if(m!=n){

            while (loop++< m/2){
                //从左上到右上；行不动；
                for (j=starty;j<n-offset;j++){
                    numerlist.add(matrix[startx][j]);
                }

                //从右上到右下；列不动；
                for (i=startx;i<m-offset;i++){
                    numerlist.add(matrix[i][j]);
                }
                //从右下到左下； 行不动，列动
                for(;j>starty;j--){
                    numerlist.add(matrix[i][j]);
                }
                //从左下到左上；
                for (;i>startx;i--){
                    numerlist.add(matrix[i][j]);
                }

                startx++;
                starty++;
                offset++;
            }
            if(m%2!=0){
                numerlist.add(matrix[startx][starty]);
                numerlist.add(matrix[startx][starty+1]);
            }
        }
        return numerlist;
    }
}
