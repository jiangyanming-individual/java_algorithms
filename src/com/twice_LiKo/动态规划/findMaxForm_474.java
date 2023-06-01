package com.twice_LiKo.动态规划;

/**
 * @author Lenovo
 * @date 2023/5/12
 * @time 8:51
 * @project java_算法
 **/
public class findMaxForm_474 {

    public int findMaxForm(String [] str,int m ,int n){

        //确定dp,子集的最大长度
        int [][] dp=new int[m+1][n+1];
        for (String s : str) {

            int zeroNum=0,oneNum=0;
            for (int i =0;i<s.length();i++){
                if (s.charAt(i) == '0'){
                    zeroNum++;
                }else {
                    oneNum++;
                }
            }
            for (int i=m;i>=zeroNum;i--){

                for (int j=n;j>=oneNum;j--){
                    //如果符合条件就 dp+1;
                    dp[i][j]=Math.max(dp[i][j],dp[i-zeroNum][j-oneNum] + 1);
                }
            }
        }
        return  dp[m][n];
    }
}
