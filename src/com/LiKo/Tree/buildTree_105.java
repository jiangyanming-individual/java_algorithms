package com.LiKo.Tree;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lenovo
 * @date 2023/2/28
 * @time 21:53
 * @project java_算法
 **/
public class buildTree_105 {

    /******
     *
     * 前序和中序遍历；
     * ******/
    Map<Integer,Integer> map;
    public TreeNode buildTree(int[] preorder,int [] inorder){

        map=new HashMap<>();
        //先遍历中序；
        for (int i=0;i< inorder.length;i++){
            map.put(inorder[i],i);
        }
        return findNode(inorder,0,inorder.length,preorder,0, preorder.length);
    }

    public TreeNode findNode(int[] inorder,int inBegin, int inEnd,int[] preorder,int preBegin,int preEnd){


        if(inBegin >=inEnd || preBegin >=preEnd){
            return null;
        }

        int rootindex=map.get(preorder[preBegin]);//得到根节点在中序中的index；
        TreeNode root= new TreeNode(inorder[rootindex]); //中序遍历中的root节点；
        //得到中序数组中的中序左子节点的个数；
        int inleft=rootindex-inBegin;//

        //左子树，中序左数组，前序左数组； 左闭右开区间：
        root.left=findNode(inorder,inBegin,rootindex,preorder,preBegin+1,preBegin+1+inleft);
        //中序数组， 前序右数组
        root.right=findNode(inorder,rootindex+1,inEnd,preorder,preBegin+1+inleft,preEnd);

        return root;
    }


}
