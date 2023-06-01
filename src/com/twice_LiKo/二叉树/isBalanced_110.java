package com.twice_LiKo.二叉树;

/**
 * @author Lenovo
 * @date 2023/4/14
 * @time 9:42
 * @project java_算法
 **/
public class isBalanced_110 {

    public boolean isBalance(TreeNode root){
        //等于-1就说明不是平衡二叉树
        return getheight(root) == -1 ? false :true;
    }
    public int getheight(TreeNode node){
        //递归终止条件：
        if (node == null)return 0;//空节点肯定是平衡二叉树；

        int left_height=getheight(node.left);
        if (left_height == -1) {
            return -1;//向上返回-1
        }
        int right_height=getheight(node.right);
        if (right_height == -1){
            return -1;
        }

        if (Math.abs(left_height-right_height)>1){
            return -1;
        }else {
            return 1+Math.max(left_height,right_height);//返回左右子树最大的高度；
        }
    }
}
