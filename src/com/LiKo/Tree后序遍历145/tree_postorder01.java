package com.LiKo.Tree后序遍历145;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/1/31
 * @time 22:13
 * @project java_算法
 **/
public class tree_postorder01 {


    /***
     * 使用递归的方式：
     *
     * ***/
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> tree_list = new ArrayList<>();
        postOrder(root,tree_list);
        return tree_list;
    }
    public void postOrder(TreeNode node ,List tree_list){

        if (node == null)
            return;
        postOrder(node.left,tree_list);
        postOrder(node.right,tree_list);
        tree_list.add(node.value);
    }

}
