package com.LiKo.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Lenovo
 * @date 2023/2/25
 * @time 10:18
 * @project java_算法
 **/
public class maxDepth_104 {
    /********
     *
     *
     * 执行递归的操作
     * ***/
    public int maxDepth(TreeNode root) {

        return getMaxdDepth(root);
    }

    int getMaxdDepth(TreeNode node){
        int depth=0;
        //递归出口
        if (node == null) return 0;

        //得到左右子树的高度
        int left_depth=getMaxdDepth(node.left);
        int right_depth=getMaxdDepth(node.right);
        //返回最高的深度然后执行加1的操作：
        depth=Math.max(left_depth,right_depth) + 1;
        return depth;
    }

    /*********
     *
     * 使用层次遍历的方法：
     * ******/

    public int maxdepth(TreeNode root){
        // new 一个队列出来
        Queue<TreeNode> queue = new LinkedList<>();
        int res=0;//记录有多少层数；
        if (root == null)
            return 0;

        queue.add(root);
        while (!queue.isEmpty()){

            int size=queue.size();//记录每一层有多少元素；
            while (size >0){
                TreeNode top = queue.poll(); //队头出队；

                if(top.left !=null){
                    queue.add(top.left);
                }
                if (top.right!=null){
                    queue.add(top.right);
                }
                size--;
            }
            //每次遍历一层就加1；
            res+=1;
        }
        return res;//返回有多少层；
    }

}
