package com.LiKo.Tree;

import org.omg.CORBA.INTERNAL;

import java.util.*;

/**
 * @author Lenovo
 * @date 2023/2/24
 * @time 9:30
 * @project java_算法
 **/
public class levelOrder_102 {


    /***
     *
     * 二叉树的层序遍历：
     *
     * **/
    public List<List<Integer>> levelOrder(TreeNode root){

        //设置一个二维数组集合；
        List<List<Integer>> resList = new ArrayList<>();
        //设置一个队列用来遍历二叉树 ，队列接口由LinkedList来实现；
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null){
            return resList;
        }

        queue.add(root);
        while (!queue.isEmpty()){

            //当队列不为空的时候；
            int size=queue.size();
            //用来存放每一层的结果：
            ArrayList<Integer> childList = new ArrayList<>();
            while (size > 0){
                //size用来记录每一层的元数个数；
                TreeNode top=queue.poll(); //弹出队头元素；
                childList.add(top.val);
                if (top.left !=null){
                    queue.add(top.left);
                }
                if (top.right !=null){
                    queue.add(top.right);
                }
                size--;
            }
            resList.add(childList);//将每层遍历的结果加入到resList中去

        }

        return resList;
    }

}
