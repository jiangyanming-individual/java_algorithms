package com.twice_LiKo.动态规划;

import java.util.List;

/**
 * @author Lenovo
 * @date 2023/5/14
 * @time 8:49
 * @project java_算法
 **/
public class wordBreak_139 {

    public boolean wordBreak(String s, List<String> wordDict){

        //确定dp
        boolean [] dp =new boolean[s.length()+1];

        //递推公式：dp[j]=true;

        //初始化dp ;空字符串也可以被字典中的元素构成：
        dp[0]=true;

        //先遍历背包再遍历物品；求的排列数；
        for (int i=1;i<=s.length();i++){

            for (String word : wordDict) {
                int len=word.length();

                //如果满足word可以拼接s，那就直接退出：
                if (i>=len && dp[i-len] && word.equals(s.substring((i-len),i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()]; //返回最终的结果：
    }
}
