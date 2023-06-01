package com.twice_LiKo.哈希表;

import java.util.HashSet;

/**
 * @author Lenovo
 * @date 2023/4/22
 * @time 8:20
 * @project java_算法
 **/
public class isHappy_202 {
    public boolean isHappy(int n){

        //因为可能会无限循环，所以顶一个hashset；
        HashSet<Integer> hashSet = new HashSet<>();
        while (n!=1 && !hashSet.contains(n)){
            hashSet.add(n); //新加入一个n；
            n=getNumber(n);
        }

        return n==1 ? true :false;
    }
    public int getNumber(int n){
        int sum=0;
        int temp;
        while (n>0){
            temp=n % 10; //取个位数；
            sum+=temp * temp;
            n=n/10; //缩小10倍；
        }
        return sum;
    }
}
