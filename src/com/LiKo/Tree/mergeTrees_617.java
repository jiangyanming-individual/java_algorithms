package com.LiKo.Tree;

import javax.swing.*;

/**
 * @author Lenovo
 * @date 2023/3/1
 * @time 13:34
 * @project java_算法
 **/
public class mergeTrees_617 {

    public TreeNode mergeTrees(TreeNode root1,TreeNode root2){
        //递归终止条件：
        if (root1 ==null)
            return root2;
        if (root2 == null)
            return root1;

        //使用前序遍历： 将root1的值的覆盖成为两个节点的和
        root1.val +=root2.val;
        //左
        root1.left=mergeTrees(root1.left,root2.left);
        //右
        root1.right=mergeTrees(root1.right,root2.right);

        return root1;
    }

}
