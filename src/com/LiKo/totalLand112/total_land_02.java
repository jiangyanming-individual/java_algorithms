package com.LiKo.totalLand112;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Lenovo
 * @date 2023/1/31
 * @time 14:35
 * @project java_算法
 **/


/*****
 *广度优先遍历：
 *
 * **/
public class total_land_02 {
    public boolean hasPathSum(TreeNode root,int targetSum){

        if(root == null)
            return false;
        //队列链表：
        Queue<TreeNode> quenode= new LinkedList<TreeNode>();
        Queue<Integer> queval = new LinkedList<>();

        quenode.add(root);
        queval.add(root.value);

        int root_value;
        //判空为false：
        while (!quenode.isEmpty()){
            TreeNode now=quenode.remove(); //当前节点出队列
            root_value=queval.remove();

            //判断当前节点是不是叶子节点：
            if(now.left == null && now.right ==null){
                if(root_value == targetSum)
                    return true;
                continue;
            }
            //如果左节点不为空：记录对应路径长度：左节点的值 + 父节点的值；
            if (now.left !=null){
                quenode.add(now.left);
                queval.add(now.left.value + root_value);
            }
            //如果右节点不为空：记录对应路径长度，右节点的值 + 父节点的值；
            if(now.right !=null){
                quenode.add(now.right);
                queval.add(now.right.value + root_value);
            }

        }
        return false;
    }
}
