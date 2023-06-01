package com.LiKo.totalLand112;

/**
 * @author Lenovo
 * @date 2023/1/31
 * @time 10:32
 * @project java_算法
 **/

/**
 *
 *
 *
 * 使用深度优先遍历 + 递归的方式
 * ***/
public class total_land_01 {

   public boolean hasPathSum(TreeNode treeNode,int targetSum){

        if(treeNode == null)
            return false;

        //是叶子节点：
        if(treeNode.left == null && treeNode.right==null) {
            return targetSum == treeNode.value; //直接判断是否相等；
        }
        //判断左右子树只要是有一个可以成功匹配就行；
        return hasPathSum(treeNode.left,targetSum- treeNode.value)
                || hasPathSum(treeNode.right,targetSum - treeNode.value);
   }
}
