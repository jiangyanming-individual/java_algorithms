package com.LiKo.Tree;

/**
 * @author Lenovo
 * @date 2023/3/1
 * @time 22:36
 * @project java_算法
 **/
public class isValidBST_98 {


    TreeNode pre=null;//定义前指针；
    public boolean isValidBST(TreeNode root){
        //使用中序递归遍历；进行二叉树的遍历；
        if(root == null)return true; //空节点也是二叉搜索树；

        boolean left=isValidBST(root.left);//左子树
        if (pre !=null && pre.val >= root.val){
            return false;//不满足升序的条件；
        }
        pre=root;//pre指向下一个节点；

        boolean right=isValidBST(root.right); //右子树；

        return left && right; //左子树和右子树都同时为true才算是二叉搜索树
    }


}
