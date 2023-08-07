package com.LinkGraph;

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
    }
}
