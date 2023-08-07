package com.LinkGraph;

import com.sun.javafx.geom.Edge;
import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Lenovo
 * @date 2023/8/7
 * @time 18:47
 * @project 定义邻接表;
 **/
public class LinkGraph {
    public VertexNode[] graph;


    public LinkGraph(int n ,int[][] edges) {
        graph = new VertexNode[n];//节点；

        for (int i = 0; i < n; i++) {
            graph[i] = new VertexNode(i, String.valueOf(i));
        }

        for (int k = 0; k < edges.length; k++) {
            int i = edges[k][0];
            int j = edges[k][1];

            EdgeNode edgeNode = new EdgeNode(j);//链表节点；

            edgeNode.next = graph[i].neighbors;
            //当前节点neighbors 就是邻居节点；
            graph[i].neighbors = edgeNode;

        }
    }


    /**
     * 图的深度优先遍历
     */

    public void dfs(int i ,boolean[] isVisited){
        System.out.println(graph[i]);
        isVisited[i]= true;

        EdgeNode neighbor=graph[i].neighbors;
        //只要还有邻居节点：
        while (neighbor!=null){
            //只要没有访问过就需要继续访问：
            if (!isVisited[neighbor.no]){
                dfs(neighbor.no, isVisited);
            }
            neighbor=neighbor.next;
        }
    }

    public void bfs(){
        //初始化一个队列；先进先出
        Queue<Integer> queue =new LinkedList<>();
        boolean[] isVisited=new boolean[graph.length];

        queue.offer(0);

        while (!queue.isEmpty()){
            int cur=queue.poll();//出队；

            if (!isVisited[cur]){//false==>true;
                System.out.println(graph[cur]);
                isVisited[cur]=true;

                EdgeNode edgeNode=graph[cur].neighbors;
                while (edgeNode!=null){
                    //如果没有加入先入队
                    if (!isVisited[edgeNode.no]){
                        queue.offer(edgeNode.no);
                    }
                    edgeNode=edgeNode.next;
                }
            }
        }

    }

    public void output() {


        for (int i = 0; i < graph.length; i++) {
            System.out.println("节点" + graph[i].toString() + "的邻居节点");
            EdgeNode edgeNode = graph[i].neighbors;
            while (edgeNode != null) {
                System.out.printf("%s \t", edgeNode);
                edgeNode = edgeNode.next;
            }
            System.out.println();
        }
    }


}

class Main{
    public static void main(String[] args) {
       int [][] edges= new int[][]{{1,0},{1,2},{2,5},{2,3},{5,3},{3,4},{4,0},{0,5}};

        LinkGraph linkGraph = new LinkGraph(6,edges);
        linkGraph.output();

        //初始化访问数组：
        boolean[] isVisited=new boolean[6];
        linkGraph.dfs(0,isVisited);
    }
}
