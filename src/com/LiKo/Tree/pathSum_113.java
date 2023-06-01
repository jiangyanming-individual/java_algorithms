package com.LiKo.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Lenovo
 * @date 2023/2/28
 * @time 10:17
 * @project java_算法
 **/
public class pathSum_113 {


    public List<List<Integer>> pathSum(TreeNode root , int targetSum){

        //存放所有的路径；
        List<List<Integer>> res_list = new ArrayList<>();
        //存放一条路径
        ArrayList<Integer> path_list = new ArrayList<>();

        if (root == null){
            return res_list;
        }
        getAllPath(root,targetSum,res_list,path_list);//进行迭代；
        return res_list;
    }
    public void getAllPath(TreeNode node,int targetSum,List<List<Integer>> res_list,List<Integer> path_list){

        //加入当前节点的值：
        path_list.add(node.val);

        //递归终止条件；
        if(node.left == null && node.right ==null){
            //先判断是不是叶子节点；

            if (targetSum - node.val == 0){
                //如果是一条路径的话就加入；
                res_list.add(new ArrayList<>(path_list));
            }
            //如果不是路径的话；直接返回；
            return;
        }

        //单层递归条件：
        if (node.left!=null) {
            getAllPath(node.left, targetSum - node.val, res_list, path_list);
            path_list.remove(path_list.size()-1);//回溯删除新加的节点的值
        }

        if(node.right!=null){
            //先减去父节点node的值：
            getAllPath(node.right,targetSum-node.val,res_list,path_list);
            path_list.remove(path_list.size()-1);//回溯；删除新添加的元素；
        }

    }

}
