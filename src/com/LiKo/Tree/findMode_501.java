package com.LiKo.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/3/2
 * @time 15:39
 * @project java_算法
 **/
public class findMode_501 {

    List<Integer> reslist;
    int count=0;//用于统计出现的次数；
    int maxCount=0;//用于统计最大的频率次数；
    TreeNode pre=null;//定义一个前指针；
    public int[] findMode(TreeNode root){

        reslist=new ArrayList<Integer>();
        traveral(root);
        int[] res = new int[reslist.size()];
        for (int i=0;i<reslist.size();i++){

            res[i]=reslist.get(i);//将list转为数组；
        }
        return res;
    }
    public void traveral(TreeNode node){

        if (node== null)
            return;

        //遍历左子树；
        traveral(node.left);

        //中；
        if (pre == null){
            //遍历第一个节点时，pre，记录第一个节点的次数；
            count=1;
        }else if(pre.val == node.val){
            count++;
        }else{
            //如果不相等的情况
            count=1;
        }
        //更新maxCount 和处理 relist列表
        if(count == maxCount){
            //如果count大小与maxCoun一样大小那就直接加入到
            reslist.add(node.val);
        }else if (count > maxCount){

            maxCount=count;//更新最大频率的值；
            reslist.clear();//清楚之前的元素；
            //加入新的元素；
            reslist.add(node.val);
        }

        pre=node;//指针指向下一个元素；
        //右子树；
        traveral(node.right);

    }

}
