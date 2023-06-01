package com.twice_LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/4/15
 * @time 9:44
 * @project java_算法
 **/
public class 背包问题01_基础1 {

    //即dp[i][j] 表示从下标为[0-i]的物品里任意取，放进容量为j的背包，价值总和最大是多少。

    public static void main(String[] args) {
        int[] weight = {1,3,4};
        int[] value = {15,20,30};
        int bagSize = 4;
        testWeightBagProblem(weight,value,bagSize);
    }
    public static void testWeightBagProblem(int[] weight,int[] value,int bagsize){

        //确定dp
        int [][] dp=new  int[weight.length][bagsize+1];//多加一列0；
        //递推公式：dp[i][j]=max(dp[i-1][j],dp[i-1][j-weight[i]] +value[i])

        //初始化 dp[i][0]=0; dp[0][j>0]=value[0]
        for (int j=1;j<=bagsize;j++){
            dp[0][j]= value[0]; //第一行除了第一个，其他全部初始化为物品0的价值：value[0]
        }


        //确定遍历顺序：先遍历物品，再遍历背包：
        for (int i=1;i< weight.length;i++){
            //因为第一行有i已经被初始化了
            for (int j=1;j<=bagsize;j++){
                //第一列也被初始化了
                if (j<weight[i]){
                    //如果背包的容量小于物品的重量的话，就直接不放物品；
                    dp[i][j]=dp[i-1][j];
                }else{
                    //不加入第i个物品 和加入第i个物品的总价值是多少。
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j- weight[i]] + value[i]);
                }
            }
        }

        //打印dp
        System.out.println("得到最大价值的矩阵：");
        for (int i=0;i< weight.length;i++){

            for (int j=0;j<=bagsize;j++){

                System.out.print(dp[i][j]+"\t");
            }

            System.out.println();
        }
    }


}
