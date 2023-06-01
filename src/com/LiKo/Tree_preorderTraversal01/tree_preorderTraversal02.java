package com.LiKo.Tree_preorderTraversal01;

import javax.swing.*;
import java.util.*;

/**
 * @author Lenovo
 * @date 2023/1/31
 * @time 20:57
 * @project java_算法
 **/
public class tree_preorderTraversal02 {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> tree_list = new ArrayList<>();
        if (root == null){//如果节点为空直接为空；
            return tree_list;
        }

        //设置一个栈即使用Deque(既可以当作队列、也可以当作栈), 用于存取节点；
        Deque<TreeNode> stack= new LinkedList<TreeNode>();
        TreeNode node=root;
        //队列不为空或者当前节点不为空
        while (!stack.isEmpty() || node !=null){

            //当前节点不为空时：
            while (node!=null){
                tree_list.add(node.value); //当前节点的值加入tree_list;
                stack.push(node); //节点进栈； push 压栈最后一个元素进入栈；
                node=node.left; //遍历左子树；
            }

            node=stack.pop();// 根节点出栈 ；pop()出栈第一个元素
            node=node.right; //遍历右子树；

        }
        return tree_list;
    }

}
