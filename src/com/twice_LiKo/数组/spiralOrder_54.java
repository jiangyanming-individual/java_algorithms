package com.twice_LiKo.数组;

import java.util.ArrayList;
import java.util.List;

/**
 * 螺旋矩阵
 */
public class spiralOrder_54 {

    public List<Integer> spiralOrder(int[][] maxtrix){

        ArrayList<Integer> resList = new ArrayList<>();
        int m= maxtrix.length;
        int n=maxtrix[0].length;


        //上下左右边界：
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=m-1;
        //循环退出条件：当resList.size<=m*n就退出循环：
        while (resList.size()< m * n){
            //从左上到右上；
            if (top<=bottom) {
                for (int j=left;j<=right;j++){
                    resList.add(maxtrix[top][j]);
                }
                //上边界+1；上边界遍历一层了往下走
                top++;
            }

            //从右上到右下；
            if (left<=right){
                for (int i=top;i<=bottom;i++){
                    resList.add(maxtrix[i][right]);
                }
                //右边界-1；右边界遍历一层了往左走
                right--;
            }

            //从右下到左下；
            if (top<=bottom){
                for (int j=right;j>=left;j--){
                    resList.add(maxtrix[bottom][j]);
                }
                //下边界-1；下边界遍历一层了；往上走
                bottom--;
            }

            //从左下到左上
            if (left<=right){
                for (int i=bottom;i>=top;i--){
                    resList.add(maxtrix[i][left]);
                }
                //左边界+1；左边界遍历一层了往右走；
                left++;
            }
        }
        //返回结果
        return resList;
    }
}
