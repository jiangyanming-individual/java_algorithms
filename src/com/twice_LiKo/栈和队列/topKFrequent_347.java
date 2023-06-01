package com.twice_LiKo.栈和队列;

import org.omg.CORBA.INTERNAL;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author Lenovo
 * @date 2023/4/21
 * @time 19:43
 * @project java_算法
 **/
public class topKFrequent_347 {

    //出现频率最多的前k个
    public int[] topKFrequent(int[] nums,int k){

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        //1. 先使用hashmap
        for (int i=0;i<nums.length;i++){
            //key:nums[i] value：出现频率：
            hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
        }

        // 2.使用优先级队列；存入的是一个数组 ；需要自定义比较器：按出现频率升序的方式排列
        PriorityQueue<int[]> queue = new PriorityQueue<>((num1, num2) -> num1[1] - num2[1]);

        //遍历一个键值对实体：
        for (Map.Entry<Integer, Integer> entry: hashMap.entrySet()) {
            if (queue.size()<k){
                //如果队列中没有放入值
                queue.add(new int[]{entry.getKey(),entry.getValue()});
            }else{
                //如果队列中已经放入了k个元素；

                //如果放入的值大于队头中元素出现的次数 ,就要进行比较将较小的进行出队
                if (entry.getValue()>queue.peek()[1]){
                    queue.poll();//出栈；
                    //加入新的值：
                    queue.add(new int[]{entry.getKey(), entry.getValue()});
                }
            }
        }

        //3.倒序插入前k个数
        int[] res = new int[k];

        //出现频率越大的数，越先出现，所以要倒序放置元素；
        for (int i=res.length-1;i>=0;i--){
            res[i]=queue.poll()[0];
        }
        return res;
    }
}
