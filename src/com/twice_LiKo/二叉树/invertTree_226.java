package com.twice_LiKo.二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Lenovo
 * @date 2023/4/10
 * @time 8:01
 * @project java_算法
 **/
public class invertTree_226 {

    public TreeNode inverTree(TreeNode root){
        //使用层次遍历：
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)return root;
        queue.add(root);

        while (!queue.isEmpty()){

            int size = queue.size();
            while (size > 0){
                TreeNode top = queue.poll();
                swap(top);
                //加入新的节点；
                if (top.left!=null){
                    queue.add(top.left);
                }
                if (top.right!=null){
                    queue.add(top.right);
                }
                size--;//每次删除一个节点，就去掉一个节点；
            }
        }
        return root;
    }
    //交换左右子节点：
    public void swap(TreeNode node){
        TreeNode temp=node.left;
        node.left=node.right;
        node.right=temp;
    }
}
