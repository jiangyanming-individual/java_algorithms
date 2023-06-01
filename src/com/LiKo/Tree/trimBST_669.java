package com.LiKo.Tree;

/**
 * @author Lenovo
 * @date 2023/3/3
 * @time 11:01
 * @project java_算法
 **/
public class trimBST_669 {


    public TreeNode trimBST(TreeNode root,int low,int high){

        if(root == null)
            //如果跟节点为空；直接返回null
            return null;
        //中：
        if (root.val < low) {
            //递归右子树，因为右子树那边的数比较大；有可能右符合条件的节点；
            TreeNode left = trimBST(root.right, low, high);
            return left;
        }else if(root.val>high){
            //递归左子树，因为左子树那边的比较小；那边有符合条条件的节点；
            TreeNode right=trimBST(root.left,low,high);
            return right;
        }
        //单层遍历：
        //左：递归左子树，返回左孩子；有可能有符合条件的节点；
        root.left=trimBST(root.left,low,high);
        //右 递归右子树，返回有孩子
        root.right=trimBST(root.right,low,high);
        return root;
    }
}
