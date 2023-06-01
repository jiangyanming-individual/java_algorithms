package com.twice_LiKo.二叉树;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/4/9
 * @time 19:14
 * @project java_算法
 **/
public class inorderTraversal_94 {

    public List<Integer> inorderTraversal(TreeNode root){

        List<Integer> resList = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode curNode=root;//指针；
        if (root == null)return  resList;

        while (curNode !=null || !stack.isEmpty()){

            if (curNode!=null){
                stack.push(curNode);
                curNode=curNode.left;//一直遍历左子节点；
            }else{
                TreeNode topNode = stack.poll();
                resList.add(topNode.val);//加入点的值；
                curNode=topNode.right;  //遍历栈顶元素的右子节点；
            }
        }
        return resList;
    }

}
