package com.LiKo.Tree;

import sun.reflect.generics.tree.Tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Lenovo
 * @date 2023/2/27
 * @time 8:51
 * @project java_算法
 **/
public class sumOfLeftLeaves_404 {

    public int sumOfLeftLeaves(TreeNode root) {
        return getNode(root);
    }
    int getNode(TreeNode node){
        if (node == null) //递归终止条件；
            return 0;
        int res=0;

        int left_value=getNode(node.left); //左
        //当前节点的左节点不为空，左节点的左子节点和右子节点都为空；，则这个节点是左叶子节点；
        if(node.left !=null && node.left.left == null && node.left.right == null){
            left_value=node.left.val;//记录左叶子节点的值；
        }

        int right_value=getNode(node.right); //右
        res=left_value + right_value; //中；
        return res;//返回结果
    }

    //使用迭代的方式：
    public int sumOfLeftLeaves02(TreeNode root){

        //使用栈的方式迭代：
        Deque<TreeNode> stack = new LinkedList<>();
        if (root == null)
            return 0;
        stack.push(root);
        int res=0;
        while (!stack.isEmpty()){
            //弹出栈顶元素；
            TreeNode top = stack.pop();
            if (top.left !=null && (top.left.left == null && top.left.right == null)){
                res+=top.left.val;
            }
            if (top.right!=null){ //右；
                stack.push(top.right);
            }
            if (top.left !=null){ //左
                stack.push(top.left);
            }

            //出栈顺序： 中-> 左-> 右；
        }
        return res;
    }
}
