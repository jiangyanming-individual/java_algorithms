package com.LiKo.Tree_inorder_中序遍历;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/2/1
 * @time 15:09
 * @project java_算法
 **/
public class tree_inorderTraversal01 {

    public List<Integer> inorderTraversal(TreeNode root) {

        ArrayList<Integer> tree_list = new ArrayList<>();


        return tree_list;
    }


    public void inorder(TreeNode node ,List tree_list){
        if(node == null)
            return;
        inorder(node.left,tree_list);
        tree_list.add(node.value);
        inorder(node.right,tree_list);

    }
}
