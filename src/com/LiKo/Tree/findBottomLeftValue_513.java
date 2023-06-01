package com.LiKo.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Lenovo
 * @date 2023/2/27
 * @time 10:18
 * @project java_算法
 **/
public class findBottomLeftValue_513 {

    /***
     *
     *使用层次遍历的方式：
     * ***/
    public int findBottomLeftValue(TreeNode root){
        //new 一个队列；
        Queue<TreeNode> queue = new LinkedList<>();

        if (root !=null){
            queue.add(root);
        }
        int result=0;

        while (!queue.isEmpty()){
            int size= queue.size();
            for (int i=0;i<size;i++){
                TreeNode front = queue.poll();
                if (i == 0){
                    result= front.val;//每次拿出第一个元素，更新result;
                }

                if (front.left !=null){
                    queue.add(front.left);
                }
                if (front.right !=null){
                    queue.add(front.right);
                }
            }

        }
        return result;
    }
    /******
     *
     * 使用递归的方式：
     *
     * 递归出口
     * 递归参数
     * 单层递归
     * ***********/
    private int Maxdepth=-1;
    private int value=0;
    public int findBottomLeftValue02(TreeNode root){
        getLeftValue(root,0);
        return value;
    }

    void getLeftValue(TreeNode node,int depth){

        if (node == null)//递归的出口；
            return;
        if (node.left == null && node.right == null){

            //更新深度和值；
            if (depth > Maxdepth){
                value=node.val;
                Maxdepth=depth;
            }
        }
        //确定单层的递归
        if (node.left !=null){
            getLeftValue(node.left,depth+1);
        }
        if (node.right !=null){
            getLeftValue(node.right,depth+1);
        }
    }



}
