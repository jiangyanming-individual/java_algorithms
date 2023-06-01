package com.LiKo.Tree;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Lenovo
 * @date 2023/3/1
 * @time 16:14
 * @project java_算法
 **/
public class searchBST_700 {

    public TreeNode searchBSt(TreeNode root,int val){
       if(root == null || root.val == val){
           return root;
       }

       if (root.val > val){
           return searchBSt(root.left,val);
       }else{
           return searchBSt(root.right,val);
       }
    }


    public TreeNode searchBSt02(TreeNode root ,int val){
        if (root == null || root.val == val){
            return root;
        }
        Stack<TreeNode> stack = new Stack<>();//新建一个栈；
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode top = stack.pop();
            if (top.val == val){
                return top;//返回目标元素的根节点；
            }
            if (top.left!=null){
                //左子树
                stack.push(top.left);
            }
            if (top.right !=null){
                //右子树；
                stack.push(top.right);
            }
        }
        return null;
    }

}
