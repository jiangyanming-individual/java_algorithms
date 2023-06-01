package com.LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/3/19
 * @time 11:52
 * @project java_算法
 **/
public class 背包问题_02 {
    public static void main(String[] args) {

        int [] weight={1,3,4};// 每个物品的重量；
        int [] value={15,20,30}; //每个物品的价值
        int bagsize=4;//背包容量；
        testWeight_Bag(weight,value,bagsize);

    }

    public static void testWeight_Bag(int [] weight,int [] value,int bagsize){
        int weight_len= weight.length;
        //定义的数组，初始化就是0
        int [] dp=new int[bagsize+1];



        //顺序遍历先遍历物品，再倒叙遍历背包；
       for (int i=0;i<weight_len;i++){

           for (int j=bagsize;j>=weight[i];j--){

                dp[j]=Math.max(dp[j],dp[j-weight[i]] + value[i]);
           }
       }
        //打印dp数组
        for (int j = 0; j <= bagsize; j++){
            System.out.print(dp[j] + " ");
        }
    }
}
