package com.LiKo.单调栈;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Lenovo
 * @date 2023/4/5
 * @time 15:42
 * @project java_算法
 **/
public class largestRectangleArea_84 {

    public int largestRectangleArea(int[] heights){

        int res=0;
        Deque<Integer> stack= new LinkedList<>();
        stack.push(0);

        for (int i=1;i< heights.length;i++){
            if (heights[i]> heights[stack.peek()]){
                //大于栈顶元素，入栈；
                stack.push(i);
            }else if (heights[i] == heights[stack.peek()]){
                stack.poll();
                stack.push(i);
            }else{
                while (!stack.isEmpty() && heights[i]< heights[stack.peek()]){

                    Integer mid = stack.peek();
                    stack.poll();//删除中间的元素；

                    while (!stack.isEmpty()){
                        int right=i;
                        int left=stack.peek();
                        int h= heights[mid]; //高度；
                        int w= right-left -1; //宽度
                        //取最大的面积：
                        res=Math.max(res,h * w);

                    }
                    stack.push(i);
                }
            }
        }

        return res;
    }
}
