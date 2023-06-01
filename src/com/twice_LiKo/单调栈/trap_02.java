package com.twice_LiKo.单调栈;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Lenovo
 * @date 2023/5/26
 * @time 9:43
 * @project java_算法
 **/
public class trap_02 {

    public int trap(int[] height){

        //雨水的总量：
        int sum=0;
        //新建一个栈：
        Deque<Integer> stack = new LinkedList<>();

        stack.push(0);
        for (int i=1;i< height.length;i++){
            if (height[i]<= height[stack.peek()]){
                stack.push(i);
            }else {
                while (!stack.isEmpty() && height[i]> height[stack.peek()]){
                    //中间元素：
                    int mid=stack.peek();
                    stack.poll();//中间元素出栈：
                    if (!stack.isEmpty()){
                        //求高度； 左右高度最小值- 中间值；
                        int h =Math.min(height[i], height[stack.peek()]) - height[mid];
                        //求宽度；
                        int w=i - stack.peek() -1;

                        sum += h * w;
                    }
                }
                //让栈保持一个递增的序列：才可以让其进栈；
                stack.push(i);
            }
        }
        //返回总的雨水的量
        return sum;
    }
}
