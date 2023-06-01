package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/3/18
 * @time 9:00
 * @project java_算法
 **/
public class numTrees_96 {

    public int numTrees(int n){

        //确定dp数组
        int [] dp=new int[n+1];
       //确定dp公式：for(int j=1;j<=i) 以j为头节点：dp[i]+=dp[j-1](左子树的节点) * dp[i-j](右子树的节点)

       //初始化dp dp[0]=1 ,dp[1]=1;
        dp[0]=1;
        dp[1]=1;

        //确定dp遍历顺序；从小到大去遍历：
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                //(以j为头节点,左子树有j-1个节点，右子树有i-j个节点) 最终的结果是左右子树的可能性相乘：
                dp[i]+=dp[j-1] * dp[i-j];
            }
        }
        //推导dp

        return dp[n];
    }
}
