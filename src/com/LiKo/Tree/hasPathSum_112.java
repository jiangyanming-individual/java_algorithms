package com.LiKo.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Lenovo
 * @date 2023/2/27
 * @time 10:47
 * @project java_算法
 **/
public class hasPathSum_112 {

    //使用递归，回溯的方法；
    public boolean hasPathSum(TreeNode root,int targetSum){

        return getTargetValue(root,targetSum);
    }

    public boolean getTargetValue(TreeNode node ,int count){
        //递归终止条件：
        if (node.left == null && node.right ==null && count==0){
            return true;
        }
        if (node.left==null && node.right ==null && count !=0){
            return false;
        }
        //单层递归的条件：递归左右子树
        if (node.left !=null){
            count-= node.left.val;
            if (getTargetValue(node.left,count)){
                return true;
            }
            count +=node.left.val; //回溯；
        }

        if (node.right!=null){
            count -=node.right.val;
            //单层递归的条件；
            if(getTargetValue(node.right,count)){
                return true;
            }
            count+=node.right.val;//回溯
        }
        return false;
    }


    //使用层次编列迭代的方式
    public boolean hasPathSum02(TreeNode root,int targetSum){
        //记录路径：
        Queue<TreeNode> queue = new LinkedList<>();
        //记录数值
        Queue<Integer> queue_val = new LinkedList<>();

        if (root == null)
            return false;

        queue.add(root);
        queue_val.add(root.val);
        while (!queue.isEmpty()){

            int size= queue.size();

            for (int i=0;i<size;i++){
                TreeNode front = queue.poll();
                int sum=queue_val.poll();//弹出值；
                if (front.left ==null && front.right == null && sum == targetSum){
                    return true;
                }

                if (front.left!=null){
                    queue.add(front.left);
                    queue_val.add(front.val + sum);//记录记录路径长度；
                }
                if(front.right !=null){
                    queue.add(front.right);
                    queue_val.add(front.val + sum);
                }
            }
        }
        return false;
    }
}
