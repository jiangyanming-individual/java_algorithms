package com.LiKo.Tree;

import sun.reflect.generics.tree.Tree;

import javax.swing.*;

/**
 * @author Lenovo
 * @date 2023/3/3
 * @time 10:06
 * @project java_算法
 **/
public class deleteNode_450 {


    public TreeNode deleteNode(TreeNode root,int key){
        //根节点为空的情况；
        if (root == null){
            return root;
        }

        if (root.val == key){

            //如果找到要删除的节点，并且要删除的元素是叶子节点；
            if (root.left==null && root.right == null){
                //直接删除叶子节点，返回null；
                return null;
            }else if(root.left == null && root.right!=null){
                //要删除的节点是左子树为空，右子树不为空，直接返回右子树；

                return root.right;
            }else if(root.left !=null && root.right==null){

                //要删除的节点的右子树为空，左子树不为空，直接返回左子树；
                return root.left;
            }else{
                //要删除的节点左右子树都不为空，将左子树拼接到要删节点的右子树的最左节点；然后返回右子树；
                TreeNode cur = new TreeNode();
                cur= root.right;//cur指向要删除节点的右孩子
                while (cur.left!=null){
                    //一直遍历到最左的叶子节点；
                    cur=cur.left;
                }
                cur.left=root.left;//cur指向将要删除节点的左孩子

                return root.right;//返回右孩子；
            }
        }

        if (root.val > key){
            //将root.left重新指向；
            root.left=deleteNode(root.left,key);
        }else{
            //递归遍历右孩子；
            //将root.right重新指向；
            root.right=deleteNode(root.right,key);
        }
        return root;
    }
}
