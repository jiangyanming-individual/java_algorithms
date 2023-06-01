package com.LiKo;

/**
 * @author Lenovo
 * @date 2022/11/22
 * @time 22:27
 * @project java_workspace
 **/
public class min_Depth1 {
    public int minDepth(TreeNode root) {

        //如果节点不存在：
        if (root == null)
            return 0;
        //只有一个节点的情况：
        if (root.left == null && root.right == null){
            return 1;
        }
        //如果左右子树，有一个不存在：
        int depth1 = minDepth(root.left);
        int depth2 = minDepth(root.right);
        if (root.left == null || root.right == null) {
                //左右子树有一个为空的情况，depth1或者depth2有一个为0；
            return depth1 + depth2 + 1;//每一层加1；
        }
        //左右子树都不为空的情况：
        return Math.min(depth1,depth2)+1;//递归的出口；

        }
 }
