package com.LiKo.Tree;

import netscape.security.UserTarget;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Lenovo
 * @date 2023/2/23
 * @time 16:50
 * @project java_算法
 **/
public class inorderTraversal_94_非递归实现 {
    /***
     *
     * 中序非递归遍历的方式：
     * 先使用栈加入节点的左子节点，一直遍历到最左边的叶子节点；
     * **/
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> resList = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        if(root == null){
            return resList;
        }
        TreeNode curNode=root; //定义个指针指向当前遍历的节点；
        while (curNode !=null || !stack.isEmpty()){
            //如果当前节点不为空，或者栈不为空的话，就直接遍历
            if (curNode !=null){
                //一直遍历节点的左孩子；
                stack.push(curNode);//将当前节点加入到栈中；
                curNode=curNode.left;//然后将指针指向左孩子；
            }else{
                //如果当前节点左孩子为空了；弹出栈顶元素
                TreeNode top = stack.pop(); //弹出顶元素
                resList.add(top.val);//将栈顶元素的值加入到resList
                curNode=top.right; //遍历弹出栈顶元素的右孩子；
            }
        }
        return resList;
    }
}
