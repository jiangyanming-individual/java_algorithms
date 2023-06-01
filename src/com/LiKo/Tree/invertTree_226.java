package com.LiKo.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Lenovo
 * @date 2023/2/24
 * @time 10:14
 * @project java_算法
 **/
public class invertTree_226 {

    //使用前序遍历递归的方式
//    public TreeNode invertTree(TreeNode root) {
//        if(root == null){
//            return root;
//        }
//        swap(root);
//        invertTree(root.left);
//        invertTree(root.right);
//
//        return root;
//    }

    /**********
     *
     * 使用层次遍历
     * *****/
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null){
            return root;
        }
        //如果根节点不为空的情况下：先加入根节点；
        queue.add(root);
        while (!queue.isEmpty()){
            int size=queue.size();//记录每一层的元素个数；
            while (size >0){
                TreeNode top = queue.poll();
                swap(top);//交换节点的左右子节点；
                //加入左右子节点：
                if (top.left !=null){
                    queue.add(top.left);
                }
                if (top.right !=null){
                    queue.add(top.right);
                }
                size--;
            }

        }
        return root;
    }
    public void swap(TreeNode node){

        //交换
        TreeNode temp=node.left;
        node.left=node.right;
        node.right=temp;
    }
}
