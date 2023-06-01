package com.LiKo.vector;

/**
 * @author Lenovo
 * @date 2023/2/3
 * @time 21:51
 * @project java_算法
 **/
public class generateMatirx_59 {

    public int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];

        int loop=0;//转圈的次数；
        int count=1;//生成数据；
        int startx=0,starty=0;
        int offset=1;//设置偏移量；
        int i,j;
        while (loop++ < n/2){


            //从左往右 ,startx 不动，starty动
            for(j=starty;j <n-offset;j++){
                res[startx][j]=count++;
            }

            //右上往右下
            for(i=startx;i <n-offset;i++){
                res[i][j]=count++;
            }

            //右下往左下 j动
            for(;j> starty;j--){
                res[i][j]=count++;
            }
            //从左下往左上；
            for(;i> startx;i--){
                res[i][j]=count++;
            }

            startx--;//转玩一圈后startx-1
            starty--;//转玩一圈后starty-1
            offset++;

        }
        //如果n/2 为奇数时：
        if(n % 2!=0){
            res[startx][startx]=count;
        }
        return res;
    }
}
