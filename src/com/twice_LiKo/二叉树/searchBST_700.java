package com.twice_LiKo.二叉树;

import sun.reflect.generics.tree.Tree;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Lenovo
 * @date 2023/5/2
 * @time 8:19
 * @project java_算法
 **/
public class searchBST_700 {

//    public TreeNode searchBST(TreeNode root,int val){
//
//        if (root ==null || root.val == val){
//            return root;
//        }
//
//        Deque<TreeNode> stack = new LinkedList<>();
//        stack.push(root);
//        while (!stack.isEmpty()){
//            //前序迭代遍历：
//            TreeNode poll = stack.poll();
//            if (poll.val==val){
//                return poll;
//            }
//            if (poll.right!=null){
//                //右
//                stack.push(poll.right);
//            }
//
//            if (poll.left!=null){
//                //左
//                stack.push(poll.left);
//            }
//
//            //出栈顺序中——>左-->右
//        }
//
//        return null;
//    }

    /**
     *使用递归的方法：
     */
    public TreeNode searchBST(TreeNode root,int val){

        //递归终止条件：
        if (root ==null || root.val == val){
            return root;
        }
        //单层递归：二叉搜索树的特性：
        if (root.val> val){
            return searchBST(root.left,val);
        }else if(root.val<val){
            return searchBST(root.right,val);
        }

        return null;
    }
}
