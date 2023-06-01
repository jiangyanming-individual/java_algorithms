package com.twice_LiKo.二叉树;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/5/5
 * @time 9:27
 * @project java_算法
 **/
public class findMode_501 {
    /**
     * 使用中序迭代法
     * @param root
     * @return
     */
    public int[] findMode(TreeNode root){
        int maxCount=0;
        int count=0;
        List<Integer> reslist = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode pre=null;
        TreeNode cur=root;
        while (!stack.isEmpty() || cur!=null){
            if (cur!=null){
                stack.push(cur);
                cur=cur.left; //左；
            }else{
                cur=stack.poll();

                //中
                if (pre ==null || cur.val!=pre.val){
                    //更新
                    count=1;
                }else{
                    count++;
                }
                //更新count的值：
                if (count == maxCount){
                    reslist.add(cur.val);
                }else if(count>maxCount){
                    maxCount=count; //更新出现最大的次数；
                    reslist.clear();
                    reslist.add(cur.val);
                }
                //更新pre
                pre=cur;
                cur=cur.right; // 右；
            }
        }

        int[] res = new int[reslist.size()];
        for (int i=0;i< reslist.size();i++){
           res[i]=reslist.get(i);
        }
        return res; //返回新的数组；
    }
}
