package com.LiKo.Tree_inorder_中序遍历;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/2/1
 * @time 15:22
 * @project java_算法
 **/
public class tree_inorderTraversal02 {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> treeNodes = new LinkedList<>();//定义一个栈；

        while (root!=null || !treeNodes.isEmpty()){
            while (root!=null){
                treeNodes.push(root);
                root=root.left;//找左子树； 进栈
            }

            root=treeNodes.pop();//没有左子树的结点出栈
            res.add(root.value);
            root=root.right;//遍历右子树；

        }

        return res;
    }
}
