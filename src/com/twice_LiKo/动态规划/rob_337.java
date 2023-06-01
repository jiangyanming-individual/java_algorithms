package com.twice_LiKo.动态规划;
/**
 * @author Lenovo
 * @date 2023/5/15
 * @time 9:12
 * @project java_算法
 **/
public class rob_337 {

    public int rob(TreeNode root){
        int[] res = traversal(root);

        return Math.max(res[0],res[1]);
    }
    /**
     * 后序遍历：
     * @param node
     * @return
     */
    public int[] traversal(TreeNode node){
        int[] dp=new int[2];

        //dp[0]是不偷当前节点， dp[1]是偷当前节点：
        //偷当前节点； node.vale + left[0] +right[0];
        //不偷当前节点,那就只能偷孩子节点;比较左右节点哪个是最大；
        // max(left[0],left[1]) + max(right[0],right[1]);

        //初始化dp
        dp[0]=0;
        dp[1]=0;

        //递归终止条件：
        if (node == null){
            return dp;
        }
        int[] left=traversal(node.left);//左
        int[] right=traversal(node.right); //右;
        //根节点

        //当前节点不偷的情况
        dp[0]=Math.max(left[0],left[1]) +Math.max(right[0],right[1]);
        //当前节点偷的情况：
        dp[1]= node.val + left[0] + right[0];//左右节点不偷的情况；
        return dp;
    }
}
