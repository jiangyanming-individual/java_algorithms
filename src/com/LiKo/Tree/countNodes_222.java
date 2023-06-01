package com.LiKo.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Lenovo
 * @date 2023/2/26
 * @time 9:19
 * @project java_算法
 **/
public class countNodes_222 {

    //使用层次遍历
    public int countNodes(TreeNode root){

        Queue<TreeNode> queue = new LinkedList<>();
        int count=0;
        if (root == null)
            return 0;

        queue.add(root);

        while (!queue.isEmpty()){

            int size=queue.size();
            count+=size; //使用层次遍历
            while (size>0){
                TreeNode top = queue.poll();
                if (top.left!=null){
                    queue.add(top.left);
                }

                if (top.right!=null){
                    queue.add(top.right);
                }

                size--;
            }
        }
        return count;
    }

    //使用递归的方式

    public int countNodes02(TreeNode root){


        return getNodes(root);
    }

    public int getNodes(TreeNode node){
        //递归的出口；
        if (node == null)
            return 0;

        int left_node=getNodes(node.left);//左
        int right_node=getNodes(node.right); //右

        int result_node=left_node + right_node + 1;//中
        return result_node;
    }

}
