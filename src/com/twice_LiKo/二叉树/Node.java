package com.twice_LiKo.二叉树;

import java.util.List;

/**
 * @author Lenovo
 * @date 2023/4/11
 * @time 8:50
 * @project java_算法
 **/
public class Node {

    public int val;
    public List<Node> children;

    public Node(){

    }

    public Node(int _val){
        this.val=_val;
    }

    public Node(int _val,List<Node> _children){
        this.val=_val;
        this.children=_children;
    }


}
