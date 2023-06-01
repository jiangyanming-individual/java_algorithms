package com.twice_LiKo.二叉树;

/**
 * @author Lenovo
 * @date 2023/4/27
 * @time 19:20
 * @project java_算法
 **/
public class constructMaximumBinaryTree_654 {
    public TreeNode constructMaximumBinaryTree(int[] nums){

       return findTreeNode(nums,0,nums.length); //左闭右区间

    }

    public TreeNode findTreeNode(int[] nums,int leftIndex,int rightIndex){

        //递归出口
        if (rightIndex - leftIndex<1){
            return null;
        }
        if (rightIndex - leftIndex == 1){
            //只有一个元素；
            return new TreeNode(nums[leftIndex]);
        }
        //找到最大值和下标；
        int maxIndex=leftIndex;
        int maxValue=nums[leftIndex];

        for (int i=leftIndex;i<rightIndex;i++){
            if (nums[i]>maxValue){
                maxValue=nums[i];
                maxIndex=i;
            }
        }

        //单层递归的条件：
        //以最大值构造根节点；
        TreeNode treeNode = new TreeNode(maxValue);

        treeNode.left=findTreeNode(nums,leftIndex,maxIndex);
        treeNode.right=findTreeNode(nums,maxIndex+1,rightIndex);

        return treeNode;
    }
}
