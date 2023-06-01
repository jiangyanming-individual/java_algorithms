package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/3/19
 * @time 10:55
 * @project java_算法
 **/
public class 背包问题_01 {

    public static void main(String[] args) {

        int [] weight={1,3,4};// 每个物品的重量；
        int [] value={15,20,30}; //每个物品的价值
        int bagsize=4;//背包容量；
        testWeight_Bag(weight,value,bagsize);
    }


    public static void testWeight_Bag(int [] weight,int [] value ,int bagsize){
        //确定dp[][] ,初始化的数组就是全是0
        int[][] dp=new int[weight.length][bagsize+1];  //多一列，因为要从0开始，把背包的为0的重量也加入进来

        //确定递推公式 dp[i][j]=max(dp[i-1][j],dp[i-1][j-weight[i]] + value[i])
        //初始dp
        for (int j=weight[0];j<=bagsize;j++){
            dp[0][j]=value[0]; //给第一行赋值，赋值是第一个物品的价值；
        }

        //确定遍历顺序；
        for (int i=1;i< weight.length;i++){

            //背包的容量：
            for (int j=1;j<=bagsize;j++){
                if (j< weight[i]){
                    //如果背包的容量小于第i个物品的重量：
                    dp[i][j]=dp[i-1][j];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-weight[i]] + value[i]);
                }
            }
        }
        //打印dp
        System.out.println("背包问题打印dp数组：");
        for (int i=0;i< weight.length;i++){

            for (int j=0;j<=bagsize;j++){
                System.out.print(dp[i][j] + "\t"); //加入制表符；
            }
            System.out.println("\n");
        }

    }
}
