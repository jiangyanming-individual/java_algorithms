package com.twice_LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/4/9
 * @time 9:11
 * @project java_算法
 **/



/****
 *
 * 处于懵逼的状态：
 * ***/
public class numTrees_96 {


    public int numTrees(int n){

        //确定dp数组  1到节点i所组成的二叉树的个数；
        int [] dp=new int[n+1]; //从0 开始
        //确定递推公式： dp[i]+=dp[j-1] * dp[i-j] 以j为头节点；(左子树j-1 ，右子树是i-j)
        //dp[3] =dp[0] * dp[2] +dp[1] * dp[1] +dp[2] * dp[0]
        //初始化dp
        dp[0]=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){

                dp[i]+=dp[j-1] * dp[i-j];
            }
        }
        //确定遍历顺序
        return dp[n];
    }
}
