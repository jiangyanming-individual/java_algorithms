package com.LiKo.Tree_preorderTraversal01;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Lenovo
 * @date 2023/1/31
 * @time 20:24
 * @project java_算法
 **/
public class tree_preorderTraversal01 {


    public  List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> tree_list = new ArrayList<Integer>();

        preorder(root,tree_list);//执行递归调用；
        return tree_list;

    }
    public void preorder(TreeNode node ,List tree_list){
        if(node ==null){//如果当前节点为空，就直接退出；
            return;
        }
        tree_list.add(node.value);
        preorder(node.left,tree_list);
        preorder(node.right,tree_list);
    }

}
