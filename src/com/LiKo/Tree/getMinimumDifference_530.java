package com.LiKo.Tree;

/**
 * @author Lenovo
 * @date 2023/3/1
 * @time 23:05
 * @project java_算法
 **/
public class getMinimumDifference_530 {


    TreeNode pre=null;
    int result=Integer.MAX_VALUE;
    //求相邻两个节点之间的最下差值；
    public int getMinimumDifference(TreeNode root){
        traversal(root);
        return result;//返回结果值；
    }

    public void  traversal(TreeNode node){
        if (node == null)
            return;
        traversal(node.left);
        if (pre !=null){
            result=Math.min(result,node.val  - pre.val);//对比更新result的值
        }
        traversal(node.right);
    }
}


