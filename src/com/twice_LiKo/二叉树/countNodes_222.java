package com.twice_LiKo.二叉树;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Lenovo
 * @date 2023/4/12
 * @time 9:23
 * @project java_算法
 **/
public class countNodes_222 {

    //使用递归的方式：
//    public int countNodes(TreeNode root){
//        return getNodes(root);
//    }
//
//    //1. 确定参数
//    public int getNodes(TreeNode node){
//
//        //2递归出口
//        if (node ==null) return 0;
//
//        int res=0;
//        //后序遍历求的是高度
//
//        //3.单层递归
//        int leftNodes=getNodes(node.left);//左
//        int rightNodes=getNodes(node.right);//右
//
//        res=leftNodes+rightNodes+1;//种
//
//        return res;
//    }


    /*****
     *
     *使用层次遍历的方式
     */
    public int countNodes(TreeNode root){

        if (root == null)return 0;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        int res=0;
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size>0){
                TreeNode top = queue.poll();
                res++;

                if (top.left!=null){
                    queue.add(top.left);
                }
                if (top.right!=null){
                    queue.add(top.right);
                }
                size--;
            }
        }
        return res;
    }
}
