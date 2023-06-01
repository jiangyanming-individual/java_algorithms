package com.twice_LiKo.二叉树;

import com.sun.javafx.image.impl.IntArgb;
import org.omg.CORBA.INTERNAL;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/4/9
 * @time 9:53
 * @project java_算法
 **/
public class preorderTraversal_144 {


    public List<Integer> preorderTraversal(TreeNode root){
        //存放结果
        ArrayList<Integer> resList = new ArrayList<>();

        //新建一个栈
        LinkedList<TreeNode> stack = new LinkedList<>();

        if (root == null) return resList;

        TreeNode curNode=root;//头节点；
        stack.push(curNode);
        //前序遍历入栈的顺序：中 ---右 ---左；
        while (!stack.isEmpty()){
            TreeNode top = stack.poll();
            resList.add(top.val); //中

            //根节点先出栈； 然后加入右节点、左节点；
            if (top.right!=null){
                stack.push(top.right); //右；
            }
            if (top.left !=null){
                stack.push(top.left); //左；
            }
        }

        return resList;
    }
}
