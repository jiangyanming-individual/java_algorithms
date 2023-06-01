package com.twice_LiKo.二叉树;

import sun.reflect.generics.tree.Tree;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Lenovo
 * @date 2023/4/11
 * @time 8:30
 * @project java_算法
 **/

//使用递归的方式
public class maxDepth_104 {

//    //1. 使用中序遍历求得树的最大深度： 确定递归参数：
//    public int maxDepth(TreeNode root){
//
//        //2.确定递归出口
//        if (root == null)return 0;
//
//        int depth=0;
//        // 3.确定单层递归
//        int leftdepth=maxDepth(root.left);
//        int rightdepth=maxDepth(root.right);
//
//        depth=Math.max(leftdepth,rightdepth)+1; //比较左右子树的最大高度，加入当前节点
//
//        return depth;
//    }

    /***
     *
     *
     * 使用层次遍历的方式：**/
    public int maxDepth(TreeNode root){

        if (root == null) return 0;
        //新建一个队列：
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int res=0;
        while (!queue.isEmpty()){

            int size = queue.size();
            while (size>0){
                TreeNode top = queue.poll();

                if (top.left!=null){
                    queue.add(top.left);
                }
                if (top.right!=null){
                    queue.add(top.right);
                }
                size--;//数量减1；
            }
            res+=1;//每次遍历一层就加1；
        }
        return res;
    }
}
