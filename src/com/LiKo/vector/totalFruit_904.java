package com.LiKo.vector;

import java.util.HashMap;

/**
 * @author Lenovo
 * @date 2023/2/3
 * @time 20:10
 * @project java_算法
 **/
public class totalFruit_904 {

    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> fruitmap= new HashMap<>();
        int left=0,right;
        int res=0;
        for (right=0;right<fruits.length;right++){

            //放入到hashmap中
            fruitmap.put(fruits[right],fruitmap.getOrDefault(fruits[right],0)+1);
            //如果种类大于2了
            while (fruitmap.size()>2){
                //减少左指针种类的数量的一个数量：
                fruitmap.put(fruits[left],fruitmap.get(fruits[left])-1);
                if(fruitmap.get(fruits[left])==0){//如果等于0直接删除掉；
                    fruitmap.remove(fruits[left]);
                }
                left++;//左指针向右移动一位；
            }
            res=Math.max(res,right-left+1);
        }

        return res;
    }
}
