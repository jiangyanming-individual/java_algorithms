package com.LinkGraph;


/***
 *
 * 边表的节点：
 */

public class EdgeNode {

    public int no; //节点编号；
    public EdgeNode next; //下一个编号；
    public EdgeNode(int no){
        this.no=no;
        next=null;
    }

    @Override
    public String toString() {
        return "EdgeNode{" +
                "no=" + no +
                ", next=" + next +
                '}';
    }
}
