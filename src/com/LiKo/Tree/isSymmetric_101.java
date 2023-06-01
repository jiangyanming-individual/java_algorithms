package com.LiKo.Tree;

import javax.swing.*;

/**
 * @author Lenovo
 * @date 2023/2/24
 * @time 11:03
 * @project java_算法
 **/
public class isSymmetric_101 {
    /*******
     *
     *
     * 使用后序遍历比较树是否是对称二叉树：
     *
     * 当需要使用节点的孩子信息时，就需要后序遍历；
     * ****/
    public boolean isSymmetric(TreeNode root){

        if (root ==null) return true;
        //使用递归的方法
        return compareTreeNode(root.left,root.right);
    }

    public boolean compareTreeNode(TreeNode left, TreeNode right){
        if (left == null && right !=null)return false;
        else if(left !=null && right == null) return false;
        else if(left == null && right ==null) return true; //如果左右节点都为空也算是对称的；
        else if(left.val != right.val) return false;//如果左右子节点不为空，并且值不相等的时候就返回false；
        boolean outside= compareTreeNode(left.left,right.right);//比较外侧；左节点的左孩子和右节点的右孩子；
        boolean inside=compareTreeNode(left.right,right.left);//比较左节点的右孩子和右节点的左孩子；

        boolean res = outside && inside;
        return res;
    }
}
