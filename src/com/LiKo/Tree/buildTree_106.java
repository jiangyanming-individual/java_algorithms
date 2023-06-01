package com.LiKo.Tree;

import org.omg.CORBA.INTERNAL;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lenovo
 * @date 2023/2/28
 * @time 10:42
 * @project java_算法
 **/
public class buildTree_106 {
    Map<Integer, Integer> map;
    //前序和后序是确定不了一颗二叉树；
    public TreeNode buildTree(int [] inorder,int [] postorder){

        map=new HashMap<>();

        for (int i=0;i< inorder.length;i++){
            map.put(inorder[i],i);//键是值，value是index
        }
        return findNode(inorder,0, inorder.length, postorder,0, postorder.length);
    }
    public TreeNode findNode(int [] inorder,int inBegin,int inEnd,int[] postorder,int postBegin,int postEnd){

        if (inBegin >= inEnd || postBegin >= postEnd) {
            //不满足条件；左闭右开的条件；
            return null;
        }

        int rootindex=map.get(postorder[postEnd-1]);//取根节点的index
        TreeNode root=new TreeNode(inorder[rootindex]); //构造新的节点；
        //保存中序的左子树的个数
        int inorderLeft_index=rootindex - inBegin;

        //左闭右开
        root.left=findNode(inorder,inBegin,rootindex,postorder,postBegin,postBegin + inorderLeft_index);
        root.right=findNode(inorder,rootindex+1,inEnd,postorder,postBegin+inorderLeft_index,postEnd-1);

        return root;
    }
}
