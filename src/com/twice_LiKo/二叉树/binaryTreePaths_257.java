package com.twice_LiKo.二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/4/14
 * @time 10:05
 * @project java_算法
 **/
public class binaryTreePaths_257 {

    public List<String> binaryTreePaths(TreeNode root){

        List<String> res = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        if (root == null){
            //如果为空直接返回空
            return res;
        }
        traversal(root,path,res);
        return res;
    }

    public void traversal(TreeNode node,List<Integer> path,List<String> res){

        //终止条件：
        path.add(node.val);
        if (node.left ==null && node.right == null){
            StringBuilder stringBuilder = new StringBuilder();
            for (int i=0;i<path.size()-1;i++){
                //不取最后一个；
                stringBuilder.append(path.get(i)).append("->");
            }
            stringBuilder.append(path.get(path.size()-1));
            res.add(stringBuilder.toString());//转为字符串类型；
            return; //递归的出口
        }

        //单层递归：
        if (node.left!=null){
            traversal(node.left,path,res);
            path.remove(path.size()-1);//回溯的过程
        }
        if (node.right!=null){
            traversal(node.right,path,res);
            path.remove(path.size()-1);//回溯的过程；
        }
    }

}
