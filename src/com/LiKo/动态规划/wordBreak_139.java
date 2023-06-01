package com.LiKo.动态规划;

import java.util.List;

/**
 * @author Lenovo
 * @date 2023/3/23
 * @time 8:54
 * @project java_算法
 **/
public class wordBreak_139 {


    public boolean wordBreak(String s, List<String> wordDict){

        //确定dp[i]
        boolean[] dp=new boolean[s.length()+1];

        //递推公式：dp[j] ==true && (i-j)是一个单词 ；那dp[i] =true;
        //初始化dp[0]=true; 其他是false
        dp[0]=true;

        //遍历顺序： 这题求的是排列数：先遍历背包再遍历物品：
        for (int i=1;i<=s.length();i++){

            //遍历物品
            for (String word : wordDict) {
                int len=word.length();
                //word.equals(s.substring(i-len,i)) word和s的(i-j,i)的子字串相等；
                if (i>=len && dp[i-len] && word.equals(s.substring(i-len,i))){
                    dp[i]=true;
                    break;//结束本次的循环；
                }
            }
        }

        return dp[s.length()];
    }
}
