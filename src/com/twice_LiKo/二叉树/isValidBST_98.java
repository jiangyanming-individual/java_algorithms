package com.twice_LiKo.二叉树;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Lenovo
 * @date 2023/5/2
 * @time 8:36
 * @project java_算法
 **/
public class isValidBST_98 {

//    TreeNode pre=null;
//    public boolean isValidBST(TreeNode root){
//
//        if (root == null)return true;//空树也是平衡二叉树；
//
//        //左
//        boolean left_valid= isValidBST(root.left);
//
//        if (pre !=null && pre.val >= root.val){
//            //不上升序的数组
//            return false;
//        }
//        pre=root;
//        //右
//        boolean right_valid = isValidBST(root.right);
//
//        return left_valid && right_valid;
//    }


    /**
     * 使用迭代中序遍历
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root){


        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode cur=root;
        TreeNode pre=null;//定义一个前向的指针；记录前一个节点
        while (cur!=null || !stack.isEmpty()){

            if (cur!=null){
                stack.push(cur);
                cur=cur.left; //一直遍历到最左下方
            }else{

                cur=stack.poll();//获取中间节点；
                if (pre!=null && pre.val>= cur.val){
                    //不满足升序条件；
                    return false;
                }
                pre=cur;
                cur=cur.right;//遍历右节点；
            }
        }
        return true;
    }
}



