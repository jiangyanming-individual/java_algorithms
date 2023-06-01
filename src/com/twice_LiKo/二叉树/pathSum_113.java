package com.twice_LiKo.二叉树;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/4/20
 * @time 20:53
 * @project java_算法
 **/
public class pathSum_113 {

    /**
     * 使用回溯算法
     * @param root
     * @param targetSum
     * @return
     */
    public List<List<Integer>> pathSum(TreeNode root , int targetSum){

        List<List<Integer>> res_list = new ArrayList<>();
        List<Integer> path_list = new ArrayList<>();

        if (root == null){
            return res_list;
        }
        //将节点放入：
        path_list.add(root.val);
        traversal(root,targetSum- root.val,res_list,path_list);
        return res_list;
    }
    // 1. 递归参数：
    void traversal(TreeNode root,int count,List<List<Integer>> res_list,List<Integer> path_list){

        //2.递归终止条件： 当前节点是叶子节点，并且count=0
        if (root.left == null && root.right ==null && count ==0){
            //如果这个路径是就新加入结果；
            res_list.add(new ArrayList<>(path_list));//加入路径中
            return;//递归出口
        }

        if (root.left ==null && root.right ==null && count!=0){
            return;
        }

        //3. 单层递归条件

        if (root.left!=null){
            path_list.add(root.left.val);
            count-= root.left.val;
            traversal(root.left,count,res_list,path_list);//使用递归；
            path_list.remove(path_list.size()-1); //回溯；
            count+= root.left.val;//回溯；
        }

        if (root.right!=null){
            path_list.add(root.right.val);
            count-= root.right.val;
            traversal(root.right,count,res_list,path_list);
            path_list.remove(path_list.size()-1);//回溯的过程；
            count+= root.right.val;
        }

        return;//结束递归；
    }
}
