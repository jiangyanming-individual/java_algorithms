package com.LiKo.单调栈;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Lenovo
 * @date 2023/4/5
 * @time 14:27
 * @project java_算法
 **/
public class trap_42 {
    
    public int trap(int[] height){


        if (height.length<=2)return 0;

        int sum=0;
        Deque<Integer> stack = new LinkedList<>();
        stack.push(0);

        for (int i=1;i< height.length;i++){

            if (height[i]<= height[stack.peek()]){
                //如果栈顶元素大于height[i]
                stack.push(i);
            }else{
                while (!stack.isEmpty() && height[i]> height[stack.peek()]){
                    //栈顶元素相当于中间的元素； 出栈；
                    int mid=stack.peek();
                    Integer poll = stack.poll(); //中间的元素出栈；

                    if (!stack.isEmpty()){
                        int h=Math.min(height[i], height[stack.peek()]) - height[mid];
                        int w=i-stack.peek() -1; //求的是宽度；最左边-最右边；
                        sum+=h * w;
                    }
                }
                stack.push(i);
            }


        }
        return sum;
    }
}
