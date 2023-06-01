package com.twice_LiKo.二叉树;

import sun.reflect.generics.tree.Tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Lenovo
 * @date 2023/4/9
 * @time 19:28
 * @project java_算法
 **/
public class levelOrder_102 {


    //进行二叉树的层次遍历：
    public List<List<Integer>> levelOrder(TreeNode root){

        ArrayList<List<Integer>> resList = new ArrayList<>();
        //新创建一个队列： 队列右size的这个属性；
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)return resList;
        queue.add(root);
        while (!queue.isEmpty()){
            //队列中有多少个元素：
            int size = queue.size();
            //遍历一层
            ArrayList<Integer> childList = new ArrayList<>();
            while (size>0){
                //size用来记录每一层的元数个数；
                TreeNode topNode = queue.poll();
                childList.add(topNode.val);

                if (topNode.left!=null){
                    queue.add(topNode.left);
                }
                if (topNode.right!=null){
                    queue.add(topNode.right);
                }
                size--;
            }
            //遍历一层后加入最终的结果中：
            resList.add(childList);
        }

        return resList;
    }
}
