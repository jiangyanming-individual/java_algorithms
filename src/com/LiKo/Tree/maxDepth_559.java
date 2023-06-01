package com.LiKo.Tree;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Lenovo
 * @date 2023/2/25
 * @time 10:42
 * @project java_算法
 **/
public class maxDepth_559 {

    public int maxDepth(Node root){

        Queue<Node> queue = new LinkedList<>();
        int res=0;//返回层数；
        if(root == null){
            return 0;
        }
        queue.add(root);
        while (!queue.isEmpty()){

            int size=queue.size();
            //遍历每一层；
            while (size > 0){
                //弹出队头元素
                Node top = queue.poll();
                //遍历node节点的孩子
                for (Node node : top.children) {
                    //遍历每一个节点的子孩子
                    if (node!=null){
                        queue.add(node);
                    }

                }
                size--; //遍历完一个；
            }
            res+=1;
        }

        return res;
    }
}
