package com.twice_LiKo.二叉树;

import sun.reflect.generics.tree.Tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Lenovo
 * @date 2023/5/5
 * @time 9:06
 * @project java_算法
 **/
public class getMinimumDifference_530 {

//    int res=Integer.MAX_VALUE;
//    TreeNode pre=null;
//    public int getMinmumDifference(TreeNode root){
//
//        if (root == null){
//            return 0;
//        }
//        return res;
//
//    }
//
//    public void traversal(TreeNode node){
//        //递归出口
//        if (node == null){
//            return;
//        }
//
//        //单层递归；
//        traversal(node.left);//左
//        if (pre!=null){
//            res=Math.min(res,Math.abs(node.val-pre.val));
//        }
//        //更新pre
//        pre=node;
//        traversal(node.right);//右
//    }

    /**
     * 使用中序迭代法；
     * @param root
     * @return
     */

    TreeNode pre=null;
    int res=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root){

        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode cur=root;//定义当前节点指针；
        while (!stack.isEmpty() ||  cur!=null){
            //当前栈不能为空或者 当前节点指针不能为空
            if (cur!=null) {
                stack.push(cur);
                cur = cur.left;//左
            }else{

                cur = stack.poll();//当前节点出栈；
                if (pre!=null){
                    res=Math.min(res, cur.val-pre.val);//中；
                }
                pre=cur;//更新pre
                cur=cur.right;//右
            }
        }
        return res;
    }
}
