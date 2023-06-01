package com.LiKo.Tree;

import javax.print.attribute.standard.NumberUp;

/**
 * @author Lenovo
 * @date 2023/3/2
 * @time 16:27
 * @project java_算法
 **/
public class lowestCommonAncestor_236 {



    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        if (root == null) return root;
        if(root == p || root ==q) {
            return root;//返回节点；
        }
        //后序遍历：
        //左子树
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        //右子树
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        //处理中的逻辑
        if (left !=null && right !=null){
            return root;
        }else if (left == null && right !=null){
            return right;
        }else if (left !=null && right == null){
            return left;
        }else{
            //全部为空的情况下返回null
            return null;
        }
    }
}
