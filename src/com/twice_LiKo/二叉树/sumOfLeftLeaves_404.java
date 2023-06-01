package com.twice_LiKo.二叉树;

/**
 * @author Lenovo
 * @date 2023/4/18
 * @time 9:19
 * @project java_算法
 **/


import java.util.Deque;
import java.util.LinkedList;

/**
 * 使用递归法
 */

public class sumOfLeftLeaves_404 {
//    public int sumOfLeftLeaves(TreeNode root){
//        //左叶子节点最多有两个；
//        if (root == null){
//            return 0;
//        }
//
//        int leftValue=sumOfLeftLeaves(root.left);//左
//        if (root.left!=null && root.left.left ==null && root.left.right==null){
//            leftValue= root.left.val;//左孩子是左叶子节点；
//        }
//        int rightValue=sumOfLeftLeaves(root.right);//右
//
//        int sum=leftValue + rightValue; //中；
//        return sum;
//    }


    /**
     * 使用迭代法===>前序遍历，用栈的方式：
     * @param root
     * @return
     */
    public int sumOfLeftLeaves(TreeNode root){

        Deque<TreeNode> stack = new LinkedList<>();
        if (root ==null){
            return 0;
        }
        int sum=0;
        stack.push(root);
        while (!stack.isEmpty()){
            //中
            TreeNode topNode = stack.poll();
            if (topNode.left!=null && topNode.left.left== null && topNode.left.right==null){
                sum+= topNode.left.val;
            }
            //右；
            if (topNode.right!=null){
                stack.push(topNode.right);
            }
            //左
            if (topNode.left!=null){
                stack.push(topNode.left);
            }
        }

        return sum;
    }
}
