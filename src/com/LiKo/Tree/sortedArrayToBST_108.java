package com.LiKo.Tree;

/**
 * @author Lenovo
 * @date 2023/3/3
 * @time 14:52
 * @project java_算法
 **/
public class sortedArrayToBST_108 {


    // 将有序的数组转为一颗平衡的二叉树：
    public TreeNode sortedArrayToBST(int nums[]){
        return traversal(nums,0, nums.length);
    }

    public TreeNode traversal(int nums[],int left,int right){
        if (left>right){
            return null;
        }
        //左闭区间，右开区间；
        int mid=(left + right)/2;
        //根节点；
        TreeNode node = new TreeNode(nums[mid]);
        //左子树节点；
        node.left=traversal(nums,left,mid-1);
        //右子树节点：
        node.right=traversal(nums,mid+1,right);
        return  node; //返回根节点；
    }

}
