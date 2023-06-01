package com.twice_LiKo.二叉树;

/**
 * @author Lenovo
 * @date 2023/4/27
 * @time 19:31
 * @project java_算法
 **/
public class mergeTrees_617 {

    public TreeNode mergeTrees(TreeNode root1,TreeNode root2){

        //使用前序遍历：
        //确定递归终止条件：

        if (root1 == null){
            return root2;
        }else if(root2 == null){
            return root1;
        }else if(root1 ==null && root2 ==null){
            return null;
        }

        //确定单层递归条件:中 -->左 -->右
        root1.val+=root2.val;
        root1.left=mergeTrees(root1.left,root2.left);
        root1.right=mergeTrees(root1.right,root2.right);

        return  root1;
    }
}
