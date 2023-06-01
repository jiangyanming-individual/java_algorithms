package com.LiKo.Tree;

import java.util.*;

/**
 * @author Lenovo
 * @date 2023/2/23
 * @time 16:49
 * @project java_算法
 **/




/************
 *
 * 后序遍历的非递归实现；
 *
 * ***/
public class postorderTraversal_145_非递归实现 {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> resList = new ArrayList<>();
        //定义一个栈用来模拟后序遍历；
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curnode=root;

        if (root ==null){
            return resList;
        }
        stack.push(root);
        while (!stack.isEmpty()){

            TreeNode top = stack.pop();
            resList.add(top.val);//弹出栈顶元素；
            //后序遍历的顺序 左 -- 右 -- 中 ；翻转一下就是中 -- 右 -- 左；

            //当前的遍历是按照这个思路 中 -- 右 -- 左； 然后将reslist数组翻转一下就成了左右中；
            if (top.left !=null){
                //先左子树进栈；后出栈
                stack.push(top.left);
            }
            if(top.right !=null){
                //右子树后进栈，先出栈；
                stack.push(top.right);
            }
        }
        //集合接口实现了翻转；
        Collections.reverse(resList);
        return resList;

    }
}
