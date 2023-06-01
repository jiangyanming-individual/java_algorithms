package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/3/24
 * @time 16:44
 * @project java_算法
 **/
public class rob_337 {

    public int rob(TreeNode root){
        int[] res = traveral(root);

        return Math.max(res[0],res[1]);//返回最大值
    }

    public int[] traveral(TreeNode node){

        //确定dp 数组dp[0]表示不偷当前节点能获取的最大金额，dp[1]的偷当前的节点能获取的最大金额；
        int [] dp=new int[2];//只有两种状态，偷或者不偷的情况；

        //递推公式： dp[1] =curvalue+left[0] +right[0](偷当前节点+左右孩子不偷的金额)
        //dp[0] =Max(left[0],letf[1]) +max(right[0],right[1]) (当前节点不偷，然后看左右孩子接待你能获取得得最多金额；)

        //初始化dp dp[0]=0,dp[1]=0；


        //递归三部曲：
        //1.确定终止条件；；
        if (node == null)
            return dp;
        //2.左右子树递归得条件；后序遍历；
        int [] left=traveral(node.left);
        int [] right=traveral(node.right);
        //当前节点不偷=左右子节点的最大情况；
        dp[0]=Math.max(left[0],left[1]) + Math.max(right[0],right[1]);
        //当前节点偷的情况+左右节点不偷的情况：
        dp[1]=node.val + left[0] + right[0];
        //返回值；
        return dp;

    }
}
