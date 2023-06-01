package com.twice_LiKo.二叉树;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lenovo
 * @date 2023/4/25
 * @time 9:44
 * @project java_算法
 **/
public class buildTree_106 {

    /**
     * 保证左闭右开的区间；
     * @param inorder
     * @param postorder
     * @return
     */
    Map<Integer,Integer> map;
    public TreeNode buildTree(int [] inorder,int [] postorder){
        //前序和后序是确定不了一颗二叉树；
        map=new HashMap<>();
        //将中序数组存入map中；(key=值，value=index)
        for (int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return findNode(inorder,0,inorder.length,postorder,0, postorder.length);
    }

    public TreeNode findNode(int [] inorder,int inBegin,int inEnd,int[] postorder,int postBegin,int postEnd){

        if (inBegin>=inEnd || postBegin>=postEnd){
            //递归出口，不满足条件：
            return null;
        }
        //找打中序中根节点的index; 后学遍历中的最后一个节点；
        int inorder_rootIndex = map.get(postorder[postEnd - 1]);
        //构造新的接待你
        TreeNode root = new TreeNode(inorder[inorder_rootIndex]);//找中序数组的根节点；
        //将中序数组的左子数组的个数求出来；
        int inorder_left_count=inorder_rootIndex-inBegin;

        //单层递归；
        root.left=findNode(inorder,inBegin,inorder_rootIndex,postorder,postBegin,postBegin+inorder_left_count);
        root.right=findNode(inorder,inorder_rootIndex+1,inEnd,postorder,postBegin+inorder_left_count,postEnd-1);
        return root;
    }

}

