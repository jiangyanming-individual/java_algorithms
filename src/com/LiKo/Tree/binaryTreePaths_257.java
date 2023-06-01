package com.LiKo.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/2/26
 * @time 10:06
 * @project java_算法
 **/
public class binaryTreePaths_257 {

    /******
     *
     * 二叉树的所有路径：
     * *******/

    public List<String> binaryTreePaths(TreeNode root){
        //返回结果集：
        List<String> res = new ArrayList<>();
        if (root == null)
            return res;
        //加入节点的路径：
        ArrayList<Integer> path = new ArrayList<>();
        getPath(root,path,res);
        return res;
    }
    public void getPath(TreeNode node,List<Integer> path,List<String> res){
        //递归的出口；

        //前序遍历；先加入节点的值：
        path.add(node.val);
        if (node.left == null && node.right == null){
            //拼接字符
            StringBuilder stringBuilder = new StringBuilder();
            for (int i=0;i<path.size()-1;i++){
                stringBuilder.append(path.get(i)).append("->");
            }
            stringBuilder.append(path.get(path.size()-1));//最后一个元素；
            res.add(stringBuilder.toString());
            return;//递归的出口；
        }
        //左子树
        if (node.left !=null){
            //递归
            getPath(node.left,path,res);
            path.remove(path.size()-1);
        }
        //右子树：

        if (node.right !=null){
            getPath(node.right,path,res);//一直到递归到叶子节点退出，然后再进行删除节点，进行回溯；
            path.remove(path.size()-1);//删除最后一个元素，进行回溯；
        }
    }


}
