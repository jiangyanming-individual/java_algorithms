package com.LiKo.Tree;

import java.util.List;

/**
 * @author Lenovo
 * @date 2023/2/25
 * @time 10:43
 * @project java_算法
 **/
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}




