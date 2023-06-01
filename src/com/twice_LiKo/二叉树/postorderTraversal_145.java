package com.twice_LiKo.二叉树;

import javax.swing.*;
import java.util.*;

/**
 * @author Lenovo
 * @date 2023/4/9
 * @time 10:22
 * @project java_算法
 **/
public class postorderTraversal_145 {

    //后序迭代遍历
    public List<Integer> postorderTraversal(TreeNode root){

        ArrayList<Integer> resList = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();

        if (root ==null)return resList;
        stack.push(root);

        while (!stack.isEmpty()){
            //中
            TreeNode top = stack.poll();
            resList.add(top.val);

            //根节点 中 先出栈； 入栈顺序 ： 左 右
            //左
            if (top.left !=null){
                stack.push(top.left);
            }
            //右
            if (top.right!=null){
                stack.push(top.right);
            }

            //出栈顺序： 中 -- 右 --- 左；
        }
        //反转后 是 左 -- 右  -- 中；
        Collections.reverse(resList); //集合接口实现了反转；
        return resList;
    }
}
