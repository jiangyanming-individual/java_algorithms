package com.twice_LiKo.二叉树;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Lenovo
 * @date 2023/4/11
 * @time 9:30
 * @project java_算法
 **/
public class minDepth_111_02 {

    //使用层次遍历
    public int minDepth(TreeNode root){
        if (root ==null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth=0;

        while (!queue.isEmpty()){

            int size = queue.size();
            depth+=1;//深度加1；
            while (size>0){

                TreeNode top = queue.poll();//队头出队；
                if (top.left!=null){
                    queue.add(top.left);
                }
                if (top.right!=null){
                    queue.add(top.right);
                }
                //如果左右子节都为空的就说明达到的了叶子节点；
                if (top.left == null && top.right ==null){
                    return depth;
                }
                size--;
            }
        }
        return depth;//返回最小的深度；
    }
}
