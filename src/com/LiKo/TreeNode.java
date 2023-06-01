package com.LiKo;

/**
 * @author Lenovo
 * @date 2022/11/8
 * @time 21:17
 * @project java_workspace
 **/

//定义树的类：
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){

    }
    TreeNode(int value){
        this.val=value;
    }

    TreeNode(int value,TreeNode left,TreeNode right){
        this.val=value;
        this.left=left;
        this.right=right;
    }
}
