package com.LiKo.Tree;

import javax.swing.*;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Lenovo
 * @date 2023/3/4
 * @time 9:26
 * @project java_算法
 **/
public class convertBST_538_非递归实现 {

    int pre=0;
    public TreeNode convertBST(TreeNode root){
        traversal(root);
        return root;//返回根节点
    }
    public void traversal(TreeNode node){
        Deque<TreeNode> stack = new LinkedList<>();//创建一个栈

        if (node == null){
            return;
        }
        stack.push(node);
        TreeNode curNode=node;//定义一个指向当前节点的指针；
        while (curNode !=null && !stack.isEmpty()){

            //遍历右子树
            if (curNode!=null){
                stack.push(curNode.right);
                curNode=curNode.right;//一直向右遍历
            }else{
                //中节点
                //如果遍历到右边的节点为空节点；就弹出节点’
                TreeNode top = stack.pop();
                top.val+=pre;
                pre=top.val;//将当前节点的值赋值给pre
                //左子树
                curNode=top.left;
            }

        }
    }
}
