package com.LiKo.Tree;

/**
 * @author Lenovo
 * @date 2023/3/2
 * @time 16:59
 * @project java_算法
 **/
public class lowestCommonAncestorBST_235 {


    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        //根据二叉搜索树的特点：
        if (root == null)
            return null;
        if (root.val > p.val && root.val >q.val) {
            TreeNode left = lowestCommonAncestor(root.left, p, q);

            if (left != null) {
                //如果返回的节点不为空的情况下
                return left;
            }
        }else if(root.val < p.val && root.val < q.val){
            TreeNode right=lowestCommonAncestor(root.right,p,q);

            if (right!=null){
                return right;
            }
        }
        //刚好root是公共祖先的话：
        return root;
    }
}
