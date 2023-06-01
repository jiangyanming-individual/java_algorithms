package com.twice_LiKo.二叉树;

import org.omg.CORBA.INTERNAL;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Lenovo
 * @date 2023/4/11
 * @time 8:50
 * @project java_算法
 **/
public class maxDepth_559 {

    public int maxDepth(Node root){

        if (root == null) return 0;
        //新建一个队列；
        Queue<Node> queue = new LinkedList<>();
        int res=0;
        queue.add(root);

        while (!queue.isEmpty()){

            int size = queue.size();
            //遍历每一层：
            while (size>0){
                //队头出栈；
                Node top = queue.poll();
                //遍历每个节点的子节点：
                for (Node node: top.children) {
                    //每个节点都是一个node；
                    if (node!=null){
                        queue.add(node);//将每个节点加入到队列中；
                    }
                }
                size--;
            }
            res++;
        }
        return -1;

    }
}
