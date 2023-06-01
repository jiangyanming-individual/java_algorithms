package com.LiKo.贪心;

/**
 * @author Lenovo
 * @date 2023/3/15
 * @time 8:32
 * @project java_算法
 **/
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){

    }

    TreeNode(int val){
        this.val=val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
