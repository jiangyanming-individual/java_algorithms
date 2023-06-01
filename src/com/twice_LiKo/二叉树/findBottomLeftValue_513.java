package com.twice_LiKo.二叉树;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Lenovo
 * @date 2023/4/19
 * @time 8:30
 * @project java_算法
 **/
public class findBottomLeftValue_513 {

    /**
     * 使用回溯算法
     * @param root
     * @return
     */
//    int MAX_DEPTH=Integer.MIN_VALUE;
//    int result=0; //定义一个全局的变量来保存最终的结果
//    public int findBottomLeftValue(TreeNode root){
//        traversal(root,0);
//        return result;
//    }
//    void traversal(TreeNode root,int depth){
//        //确定递归出口
//        if (root.left==null && root.right==null){
//            if (depth>MAX_DEPTH){
//                MAX_DEPTH=depth;
//                result= root.val;
//            }
//            return;
//        }
//
//        //确定单层递归：
//        if (root.left!=null){
//            depth++;
//            traversal(root.left,depth);//回溯的过程；
//            depth--;
//        }
//        if (root.right!=null){
//            depth++;
//            traversal(root.right,depth);//回溯的过程
//            depth--;
//        }
//        return;
//    }

    /**
     * 使用层次遍历的方式：
     */

    int result=0;
    public int findBottomLeftValue(TreeNode root){
        //使队列来存储：
        Queue<TreeNode> queue = new LinkedList<>();

        if (root ==null){
            return 0;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            //层次遍历：
            for(int i=0;i<size;i++){
                //队头出栈：
                TreeNode top = queue.poll();
                if (i==0){
                    //保存第一个数：
                    result=top.val;
                }
                if (top.left!=null){
                    queue.add(top.left);
                }
                if (top.right!=null){
                    queue.add(top.right);
                }
            }
        }
        //返回结果
        return result;
    }

}
