package com.LiKo.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/2/23
 * @time 15:41
 * @project java_算法
 **/




public class preorderTraversal_144 {


    //二叉树的前序遍历；
     public List<Integer> preorderTraversal(TreeNode root){

         ArrayList<Integer> resList = new ArrayList<>();
         preorder(root,resList);
         return resList;
     }
     public void preorder(TreeNode root,ArrayList resList){
         if (root == null){
             return;//递归终止条件；
         }
         //根左右的遍历二叉树；
         resList.add(root.val);
         preorder(root.left,resList);
         preorder(root.right,resList);
     }
}
