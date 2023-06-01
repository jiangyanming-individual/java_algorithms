package com.LiKo.Tree;

import sun.reflect.generics.tree.Tree;

/**
 * @author Lenovo
 * @date 2023/2/26
 * @time 9:30
 * @project java_算法
 **/
public class isBalanced_110 {

    //使用后序递归得到平衡二叉的高度；
    public boolean isBalanced(TreeNode root){

        int height = getheight(root);
        return height == -1 ? false : true;
    }

    public int getheight(TreeNode node){

        if (node == null)
            return 0;
        int left_height=getheight(node.left); //左，返回节点的高度；
        if (left_height == -1){
            return -1;//向上返回-1；说这个树不是平衡二叉树；
        }
        int right_height=getheight(node.right); //右
        if (right_height == -1){
            return -1;
        }
        if (Math.abs(left_height - right_height)>1){
            return -1;//不是平衡二叉树；直接返回-1
        }else{
            return 1+Math.max(left_height,right_height);//返回左右子树最大的高度；
        }
    }


}
