package com.LiKo.backtrack;

import com.LiKo.List.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 * @date 2023/3/5
 * @time 9:51
 * @project java_算法
 **/
public class combinationSum3_216 {
    List<List<Integer>> res;//返回最终的结果集
    List<Integer> pathList;//加入路径
    public List<List<Integer>> combinationSum(int k,int n){
        //k个数，和是n
         res = new ArrayList<>();
         pathList=new ArrayList<>();
         int sum =0;
         backtracking(k,n,sum,1);
         return res;
    }

    public void backtracking(int k,int n,int sum,int startIndex){
        if (pathList.size() == k){
            //k 个数决定递归的深度
            if (sum == n){
                res.add(pathList);//加入路径；
                return;
            }
        }
        for (int i=startIndex;i<=9-(k - pathList.size())+1;i++){
//            或者for (int i=startIndex;i<=9;i++)
            // [1-,9]之间的数决定树的宽度；
            // 9-(k - pathList.size())+1是做剪枝的操作；加1是为了对标下标；也可以直接写为i<=9
            sum+=i;
            pathList.add(i);
            backtracking(k,n,sum,i+1);//递归深度由
            //回溯
            sum-=i;
            pathList.remove(pathList.size()-1);
        }

    }


}