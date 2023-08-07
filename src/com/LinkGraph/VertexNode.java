package com.LinkGraph;

/**
 *定义的节点；
 **/


public class VertexNode {

    public int no;//节点编号；
    public String info;//节点额外信息;
    public EdgeNode neighbors; //邻居节点；

    public VertexNode(int no,String info){
        this.no=no;
        this.info=info;
        neighbors=null;
    }

    //转为字符串：
    @Override
    public String toString() {
        return "VertexNode{" +
                "no=" + no +
                ", info='" + info + '\'' +
                ", neighbors=" + neighbors +
                '}';
    }
}
