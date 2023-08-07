package com.MatricGraph;

/**
 * @author Lenovo
 * @date 2023/8/7
 * @time 17:21
 * @project 定义邻接矩阵;
 **/
public class MatricGraph {

    public Vertex[] vertices;

    public int[][] matric;

    //邻接矩阵：节点和边(二维矩阵)
    public MatricGraph(int n ,int [][] edges){
        vertices=new Vertex[n];//节点；
        matric=new int [n][n];//矩阵

        for (int i=0;i<n;i++){
            //初始化节点信息：
            vertices[i]=new Vertex(i,String.valueOf(i));
        }

        for (int k = 0; k < edges.length; k++) {
            int i= edges[k][0];
            int j= edges[k][1];
            matric[i][j]=1;
        }


    }
    public void output(){
        for (int i=0;i<matric.length;i++){

            for (int j=0;j<matric[0].length;j++){
                //输出矩阵：
                System.out.printf("%d \t",matric[i][j]);
            }
            System.out.println();
        }
    }
}

class Main{
    public static void main(String[] args) {
        int [][] edges=new int[][]{{1,0},{1,2},{2,5},{2,3},{5,3},{3,4},{4,0},{0,5}};
        MatricGraph graph=new MatricGraph(6,edges);
        graph.output();
    }
}