package com.twice_LiKo.数组;

/**
 * 螺旋矩阵2--->模拟
 */
public class generateMatrix_59 {

    public int[][] generateMatrix(int n){
        int[][] res=new int[n][n];
        int loop=n/2; //循环的圈数： 如果n为奇数就中间还空下一个，如果n为偶数则直接循环完；

        int startx=0,starty=0;
        int offset=1;//偏移量为1；保持左闭右开的原则：
        int value=1;//给矩阵填充值
        int i,j;

        while (loop-- > 0){

            //从上左往上右；
            for (j= starty;j<n-offset;j++){
                res[startx][j]=value++;
            }

            //从上右往下右；
            for (i=startx;i<n-offset;i++){
                res[i][j]=value++;
            }
            //从下右往下左；
            for (;j>starty;j--){
                res[i][j]=value++;
            }
            //从下左往上左；
            for (;i>startx;i--){
                res[i][j]=value++; //到达j
            }
            //下一轮循环
            offset++;
            startx++;
            starty++;
        }
        //如果n为奇数的话
        if (n % 2 !=0){
            res[n/2][n/2]=value;
        }
        return res;
    }
}
