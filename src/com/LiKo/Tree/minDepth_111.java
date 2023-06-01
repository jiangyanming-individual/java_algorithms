package com.LiKo.Tree;

/**
 * @author Lenovo
 * @date 2023/2/25
 * @time 11:01
 * @project java_算法
 **/
public class minDepth_111 {

    public int minDepth(TreeNode root){
        return getMinDepth(root);
    }

    //递归后序遍历
    //1递归参数
    int getMinDepth(TreeNode node){
        if (node == null) //2、递归的出口；
            return 0;
        int left_depth=getMinDepth(node.left);
        int right_depth=getMinDepth(node.right);



        //3单层递归的逻辑；
        //如果左右子树有一个为空的情况下
        if (node.left == null && node.right !=null){
            return 1+right_depth;
        }
        //如果左右子树有一个为空的情况下
        if (node.left!=null && node.right == null){
            return 1+left_depth;
        }
        //如果左右子树都不为空的情况
        int res=1 + Math.min(left_depth,right_depth);
        return res;
    }

}
