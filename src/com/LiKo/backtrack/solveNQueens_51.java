package com.LiKo.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/3/9
 * @time 18:31
 * @project java_算法
 **/
public class solveNQueens_51 {

    List<List<String>> res=new ArrayList<>();
    public List<List<String>> solveNQueens(int n){
        char[][] chessboard=new char[n][n];
        for (char[] c: chessboard) {
            //首先使用. 进行初始化数组
            Arrays.fill(c,'.');
        }
        backtracking(n,0,chessboard);
        return res;
    }

    public void backtracking(int n,int row ,char[][] chessboard){

        if (row == n){
            //如果遍历到叶子节点了，就加入棋盘
            res.add(charToArrayList(chessboard));
            return;
        }
        //遍历列：
        for (int col=0;col< n;col++){

            if (isValid(row,col,n,chessboard)){
                chessboard[row][col] ='Q';
                backtracking(n,row+1,chessboard);
                chessboard[row][col] ='.';
            }
        }

    }
    //将数组转为ArrayList
    public List<String> charToArrayList(char[][] chessboard){
        List<String> list=new ArrayList<>();

        for (char[] c: chessboard) {
            //将数组转为字符串
            list.add(String.copyValueOf(c));
        }
        return list;
    }

    public boolean isValid(int row,int col,int n,char[][] chessboard){

        //校验列：
        for (int i=0;i<n;i++){
            //如果一列中没有Q就
            if (chessboard[i][col] == 'Q')
                return false;
        }


        //校验45度

        for (int i=row-1,j=col-1;i>=0 &j >=0;i--,j--){
            if (chessboard[i][j] == 'Q'){
                return false;
            }
        }
        //校验135度：
        for (int i=row-1,j=col+1;i >=0 && j< n;i--,j++){
            if (chessboard[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
}

