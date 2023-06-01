package com.LiKo.Tree;

/**
 * @author Lenovo
 * @date 2023/3/4
 * @time 8:52
 * @project java_算法
 **/
public class convertBST_538 {

    int pre=0;//定义一个前向指针，值初始为0
    public TreeNode convertBST (TreeNode root){
        if (root == null){
            return null;
        }
        traversal(root);
        return root;//返回root根节点；
    }

    public void traversal(TreeNode node){
        //递归结束的条件；
        if (node == null){
            return;
        }
        //确定单层递归的顺序；递归的顺序是右中左的顺序；然后更改节点的值；
        traversal(node.right);
        node.val+=pre;//初始pre的值为0
        pre=node.val;//pre的值指向node节点；
        traversal(node.left);
    }
}
