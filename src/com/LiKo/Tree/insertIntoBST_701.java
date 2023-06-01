package com.LiKo.Tree;

import jdk.nashorn.internal.ir.CallNode;
import sun.reflect.generics.tree.Tree;

/**
 * @author Lenovo
 * @date 2023/3/3
 * @time 9:26
 * @project java_算法
 **/
public class insertIntoBST_701 {



    public TreeNode insertIntoBST(TreeNode root,int val){

        if(root == null){
            //如果根节点为空的情况下，直接返回一个新的节点；
            TreeNode node = new TreeNode(val);
            return node;//返回新插入的节点的值
        }

        //单层递归：
        if (root.val > val){
            //将找到的节点返回给当前节点的左子树；
            root.left=insertIntoBST(root.left,val);
        }else if (root.val < val){
            //将找到的节点返回给当前节点的右子树；
            root.right=insertIntoBST(root.right,val);
        }
        return root;//返回根节点的路径；
    }
}
