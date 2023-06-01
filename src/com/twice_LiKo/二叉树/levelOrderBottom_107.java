package com.twice_LiKo.二叉树;

import java.util.*;

/**
 * @author Lenovo
 * @date 2023/4/9
 * @time 19:40
 * @project java_算法
 **/
public class levelOrderBottom_107 {

    public List<List<Integer>> levelOrderBottom(TreeNode root){
        List<List<Integer>> resList = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)return resList;
        queue.add(root);

        while (!queue.isEmpty()){
            //层次遍历：
            int size = queue.size();
            List<Integer> childList = new ArrayList<>();
            while (size>0){
                //遍历一层
                TreeNode top = queue.poll();
                childList.add(top.val);

                if (top.left!=null){
                    queue.add(top.left);
                }
                if (top.right!=null){
                    queue.add(top.right);
                }
                size--;
            }
            //加入一层的结果：
            resList.add(0,childList);//每次都加入index=0，这样最先加入的都到后面取了
        }

        return resList;
    }
}
