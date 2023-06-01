package com.LiKo.Tree;

/**
 * @author Lenovo
 * @date 2023/3/1
 * @time 12:44
 * @project java_算法
 **/
public class constructMaximumBinaryTree_654 {

    public TreeNode constructMaximumBinaryTree(int nums[]){

        return findNode(nums,0,nums.length);
    }
    //递归遍历树的节点；
    public TreeNode findNode(int[] nums,int leftIndex,int rightIndex){

        if(rightIndex - leftIndex <1){
            //没有元素
            return null;
        }
        if (rightIndex - leftIndex == 1){
            //只有一个节点时
            return new TreeNode(nums[leftIndex]);
        }
        int maxIndex=leftIndex; //最大值的下标是
        int maxValue=nums[maxIndex];
        //比较剩余数组中最大的元素，保存最大元素的大小和下标值；
        for (int i=leftIndex+1;i<rightIndex;i++){
            if(nums[i] > maxValue){
                maxValue=nums[i];
                maxIndex=i;
            }
        }
        //返回最大的根节点的值；
        TreeNode node=new TreeNode(maxValue);

        node.left=findNode(nums,leftIndex,maxIndex);//递归遍历左子树；
        node.right=findNode(nums,maxIndex+1,rightIndex);//右子树
        return node;
    }
}
