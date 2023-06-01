package com.twice_LiKo.二叉树;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Lenovo
 * @date 2023/4/20
 * @time 20:34
 * @project java_算法
 **/
public class hasPathSum_112 {


    /**
     * 使用回溯算法
     * @param root
     * @param targetSum
     * @return
     */

//    public boolean hasPathSum(TreeNode root,int targetSum){
//        if (root ==null) {
//            return false;
//        }
//        //使用回溯算法
//        return traversal(root,targetSum- root.val);//节点
//    }
//
//    //1.0 递归参数
//    boolean traversal(TreeNode root,int count){
//        //2.确定递归出口
//        //当前节点维叶子节点，并且count -当前节点的值 ==0  如果不等于0就是false
//        if (root.left == null && root.right==null && count==0) return true;
//        if (root.left ==null && root.right ==null &&count!=0) return false;
//        //3. 单层递归
//
//        if (root.left!=null){
//            count-= root.left.val;
//            if (traversal(root.left,count)) return true;//如果下一层的回溯满足条件；
//            count+= root.left.val;//回溯；
//        }
//
//        if (root.right!=null){
//            count-= root.right.val;
//            if (traversal(root.right,count)) return true; //如果下一层的回溯满足条件；
//            count+= root.right.val;
//        }
//        return false; //如果不满足就返回false；
//    }


    /**
     * 使用层次遍历的方式：
     * @param root
     * @param targetSum
     * @return
     */
    public boolean hasPathSum(TreeNode root,int targetSum){

        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> queue_val = new LinkedList<>();
        if (root ==null) return false;

        queue.add(root);
        queue_val.add(root.val);

        while (!queue.isEmpty()){
            int size = queue.size();

            while (size>0){
                //两个队列的队头都出队：
                TreeNode top = queue.poll();
                int sum=queue_val.poll();
                //满足条件就直接返回false
                if (top.left ==null && top.right ==null && sum ==targetSum){
                    return true;
                }
                if (top.left!=null){
                    queue.add(top.left);
                    queue_val.add(sum+top.left.val);//加上当前节点的值；
                }
                if (top.right!=null){
                    queue.add(top.right);
                    queue_val.add(sum+top.right.val);
                }
                size--;
            }
        }

        return false;
    }
}
