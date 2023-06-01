package com.LiKo.queue_stack;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author Lenovo
 * @date 2023/2/23
 * @time 10:16
 * @project java_算法
 **/
public class topKFrequent_347 {

    //先将元素加入到hashmap集合中；

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i=0;i< nums.length;i++){
            //getOrDefault默认当前的key是0；
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i],0)+1);
        }

        //新建一个优先级队列，小根堆；将键值对加入到优先级队列中；
        //存储的是一个数组，里面放(key,value)
        PriorityQueue<int[]> que = new PriorityQueue<>((pair1,pair2)->pair1[1]-pair2[1]);; //加入的是键值对；

        for (Map.Entry<Integer,Integer> entry:hashMap.entrySet()) {
            //遍历hashmap的键值对；

            if (que.size() < k){
                que.add(new int[] {entry.getKey(),entry.getValue()});
            }else{
                if (entry.getValue() > que.peek()[1]){
                    //如果要加入的value 大于队头的value就先删除队头；再键入；
                    que.poll();
                    que.add(new int[]{entry.getKey(),entry.getValue()});
                }
            }
        }

        int[] res = new int[k];


        for (int i=res.length-1;i>=0;i--){
            //将key倒叙加入到res数组中，因为队头的元素都是出现频率小的元素，
            //因为实现的小根堆，所以说后面出队的都是出现频率比较的数；
            res[i]=que.poll()[0];
        }
        return res;
    }
}
