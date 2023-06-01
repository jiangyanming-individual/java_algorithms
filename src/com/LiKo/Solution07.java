package com.LiKo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Lenovo
 * @date 2022/11/10
 * @time 11:37
 * @project java_workspace
 **/
public class Solution07 {

    public boolean isSymmetric(TreeNode root) {

        Queue<TreeNode> stack = new LinkedList<>();//定义一个栈；List 、 Deque、Cloneable;
        stack.add(root);
        stack.add(root);//root进栈；

        while (!stack.isEmpty()){
            TreeNode t1=stack.poll();//出栈
            TreeNode t2=stack.poll();

            if(t1==null && t2==null)
                continue;
            if(t1==null || t2==null || t1.val!=t2.val)
                return false;

            stack.offer(t1.left);//t1.左子树进栈
            stack.offer(t2.right);//t2.右子树进栈
            stack.offer(t1.right);
            stack.offer(t2.left);
        }

        return true;

    }


    //遍历二叉树的最大深度：
    public int maxDepth(TreeNode root) {

        if(root==null){
            return 0;
        }

        Queue<TreeNode> stack = new LinkedList<>();
        stack.offer(root);
        int res=0;
        while (!stack.isEmpty()){
            int len=stack.size();//得到栈的长度；

            while (len-- >0){
                TreeNode treeNode=stack.poll();//上一层节点出栈；

                if(treeNode.left!=null){
                    stack.offer(treeNode.left);
                }
                if (treeNode.right!=null){
                    stack.offer(treeNode.right);
                }
            }

            res+=1;//每遍历完一层就要加一；
        }

        return res;
    }


    //将有序的数组转为二叉排序树：

    public TreeNode sortedArrayToBST(int[] nums) {

        return BSThelper(nums,0, nums.length-1);
    }
    public TreeNode BSThelper(int[] nums,int left, int right){

        if(left>right)
            return null;
        int mid=(left+right)/2;

        TreeNode treeNode = new TreeNode(nums[mid]);//新加入一个节点作为根节点；
        treeNode.left=BSThelper(nums,left,mid-1);//给左子节点赋值；
        treeNode.right=BSThelper(nums,mid+1,right);//给右子节点赋值；

        return treeNode;
    }


    //判断是否是平衡二叉树：

    public boolean isBalanced(TreeNode root) {
        if (root==null){
            return true;
        }else{
            return Math.abs(height(root.left)-height(root.right)) <=1
                    && isBalanced(root.left) && isBalanced(root.right);//要判断左右子树是否都是平衡二叉树；
        }

    }
    //返回树的高度
    public int height(TreeNode root){

        if(root==null){
            return 0;
        }else{
            return Math.max(height(root.left),height(root.right))+1;//返回树的高度；
        }
    }

}
