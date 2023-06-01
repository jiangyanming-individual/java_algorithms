package com.twice_LiKo.单调栈;

import org.omg.CORBA.INTERNAL;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Lenovo
 * @date 2023/4/9
 * @time 8:55
 * @project java_算法
 **/
public class trap_42 {

    public int trap(int[] height){

        int sum=0;//雨水总量；
        Deque<Integer> stack = new LinkedList<>();
        stack.push(0);

        for (int i=1;i< height.length;i++){

            if (height[i]<= height[stack.peek()]){
               stack.push(i);
            }else {

                while (!stack.isEmpty() && height[i]> height[stack.peek()]){
                    int mid=stack.peek();
                    stack.poll();//删除中间元素；
                    if (!stack.isEmpty()){
                        //求最小的高度；(最右边的的高度， 最左边的高度与中间的差值)
                        int h=Math.min(height[i], height[stack.peek()]) - height[mid];
                        int w=i-stack.peek()-1;//求宽度； //右边元素下标 -左边元素下标；

                        sum+=h * w;
                    }
                }
                stack.push(i);
            }
        }
        return sum;
    }
}
