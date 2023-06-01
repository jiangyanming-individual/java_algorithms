package com.twice_LiKo.二叉树;

import com.sun.scenario.effect.impl.prism.PrReflectionPeer;

/**
 * @author Lenovo
 * @date 2023/4/11
 * @time 9:20
 * @project java_算法
 **/
public class minDepth_111 {

    public int minDepth(TreeNode root){
        return getminDepth(root);
    }

    public int getminDepth(TreeNode node){

        int depth=0;
        //都为空的情况下
        if (node == null) return 0;

        //单层递归的条件：
        int leftdepth=getminDepth(node.left);
        int rightdepth=getminDepth(node.right);

        //如果左右子树有一个为空的情况下
        if (node.left == null && node.right!=null){
            return rightdepth + 1;
        }
        //如果左右子树有一个为空的情况下
        if (node.left!=null && node.right==null){
            return leftdepth + 1;
        }
        //左右子树都不为空的情况下，取最小的深度+1；
        depth=Math.min(leftdepth,rightdepth)+1;//都不为空的情况下；
        return depth;
    }
}
