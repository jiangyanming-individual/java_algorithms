package com.LiKo;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2022/11/8
 * @time 22:06
 * @project java_workspace
 **/
public class Solution06 {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> number_list = new ArrayList<>();
        inorder(root,number_list);
        return number_list;
    }

    public void inorder(TreeNode root,List<Integer> number_list){
        if (root==null){
            return;
        }
        inorder(root.left,number_list);//遍历左子树
        number_list.add(root.val);
        inorder(root.right,number_list);//遍历右子树

    }

    public List<Integer> inorderTraversal_2(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> treeNodes = new LinkedList<>();//定义一个栈；

        while (root!=null || !treeNodes.isEmpty()){
            while (root!=null){
                treeNodes.push(root);
                root=root.left;//找左子树； 进栈
            }

            root=treeNodes.pop();//没有左子树的结点出栈
            res.add(root.val);
            root=root.right;//遍历右子树；

        }

        return res;
    }

    //对称二叉树：
    public boolean isSymmetric(TreeNode root) {

        return check(root,root);

    }

    public boolean check(TreeNode t1,TreeNode t2){
        if (t1==null && t2==null){
            return true;
        }

        if(t1==null || t2==null){
            return false;
        }

        return (t1.val==t2.val) && check(t1.right,t2.left) && check(t1.left,t2.right);
    }


    //得到树的最大深度：
    public int maxDepth(TreeNode root) {


        if(root==null)
            return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }

}
