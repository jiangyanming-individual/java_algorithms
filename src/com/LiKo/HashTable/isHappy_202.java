package com.LiKo.HashTable;

import java.util.HashSet;

/**
 * @author Lenovo
 * @date 2023/2/10
 * @time 20:13
 * @project java_算法
 **/
public class isHappy_202 {
    public boolean isHappy(int n) {

        HashSet<Integer> numberSet = new HashSet<>();
        while (n!=1 && !numberSet.contains(n)){
            numberSet.add(n);
            n=getnextnumber(n);
        }
        return n==1 ? true : false;
    }
    public int getnextnumber(int n){
        int res=0;
        while (n>0){//拆分 n 的每个位上的数
            int temp;
            temp=n % 10;//取个位；
            res +=temp * temp;
            n= n / 10 ; // n缩小10倍
        }
        return res;

    }
}
