package com.LiKo.HashTable;

import java.util.HashSet;

/**
 * @author Lenovo
 * @date 2023/2/20
 * @time 18:27
 * @project java_算法
 **/
public class isHappy_202_02 {

    /***
     *
     *
     * 编写一个算法来判断一个数 n 是不是快乐数。
     *
     * 「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和
     * ，然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
     * 如果 可以变为  1，那么这个数就是快乐数。
     *
     *
     * **/
    public boolean isHappy(int n) {
        HashSet<Integer> hashSet = new HashSet<>();

        while (n !=1 && !hashSet.contains(n)){
            hashSet.add(n);
            n=getNumber(n);//进行求平方和的运算；
        }

        return n == 1 ? true :false;
    }

    public int getNumber(int n){
        int sum=0;
        int temp;
        while (n>0){
            temp=n % 10; //取余数，取个位数；
            sum+=temp * temp;
            n=n/10; //缩小10倍；
        }
        return sum;
    }


}
