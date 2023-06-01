package com.twice_LiKo.二叉树;

import sun.reflect.generics.tree.Tree;

/**
 * @author Lenovo
 * @date 2023/4/9
 * @time 9:54
 * @project java_算法
 **/
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(){

    }

    public TreeNode(int val){
        this.val=val;
    }
    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val=val;
        this.left=left;//右
        this.right=right; //左

    }
}
