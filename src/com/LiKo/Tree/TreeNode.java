package com.LiKo.Tree;

/**
 * @author Lenovo
 * @date 2023/1/31
 * @time 10:35
 * @project java_算法
 **/
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    //无参数构造器：
    TreeNode(){

    }
    TreeNode(int val){
        this.val=val;
    }
    //有参数构造器：
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
