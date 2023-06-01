package com.LiKo.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Lenovo
 * @date 2023/2/23
 * @time 16:48
 * @project java_算法
 **/
public class preorderTraversal_144_非递归实现 {

    public List<Integer> preorderTraversal(TreeNode root){
        ArrayList<Integer> resList = new ArrayList<>();

        //使用一个栈来模拟
        Stack<TreeNode> stack = new Stack<>(); //加入栈的是树的节点；
        //前序遍历入栈的顺序 中 -->右 -->左
        if (root == null){
            //如果为空树的情况下直接返回reslist
            return resList;
        }
        TreeNode curnode=root;
        stack.push(curnode);
        while (!stack.isEmpty()){
            //首先弹出栈顶元素；
            TreeNode top = stack.pop();
            resList.add(top.val);
            //前序遍历入栈的顺序 中 -->右 -->左
            if (top.right !=null){
                //如果左子树不为空
                stack.push(top.right);
            }
            if (top.left !=null){
                stack.push(top.left);
            }
            //出栈的顺序 中 ---左 ---右；
        }
        return resList;
    }
}
