package com.LiKo.Tree_preorderTraversal01;

/**
 * @author Lenovo
 * @date 2023/1/31
 * @time 10:35
 * @project java_算法
 **/
public class TreeNode {

    int value;
    TreeNode left;
    TreeNode right;

    //无参数构造器：
    TreeNode(){

    }
    TreeNode(int value){
        this.value=value;
    }
    //有参数构造器：
    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
