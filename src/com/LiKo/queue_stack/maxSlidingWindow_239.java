package com.LiKo.queue_stack;

/**
 * @author Lenovo
 * @date 2023/2/22
 * @time 19:14
 * @project java_算法
 **/




public class maxSlidingWindow_239 {

    /*****
     *
     * 使用单调栈来维护；
     *
     * ***/
    public int[] maxSlidingWindow(int[] nums, int k) {

        if (nums.length == 1){
            return nums;
        }

        int len=nums.length - k + 1;//返回结果的长度；

        int[] res= new int[len];
        int count=0;//定于用于计数的count

        MyQueue_max queue_max = new MyQueue_max();
        for (int i=0;i<k;i++){
            //先将前k个加入到队列中去；保持k也是单调递减的队列
            queue_max.add(nums[i]);
        }
        res[count++]=queue_max.peek();//第一个k数中，队头是最大的元素；

        //遍历后面的数组
        for (int i=k;i< nums.length;i++){
            //将队头的元素移除
            queue_max.poll(nums[i-k]);

            //将后面的元素加入；
            queue_max.add(nums[i]);
            //将这次的k个数中最大的元素加入到res中；
            res[count++]=queue_max.peek();
        }

        return res;
    }
}
