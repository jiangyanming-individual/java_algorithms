package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/3/24
 * @time 16:45
 * @project java_算法
 **/
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}