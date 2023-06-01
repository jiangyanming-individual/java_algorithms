package com.twice_LiKo.单调栈;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Lenovo
 * @date 2023/5/26
 * @time 10:04
 * @project java_算法
 **/
public class largestRectangleArea_02 {

    /**
     * 栈满足递减的操作就行
     * @param heights
     * @return
     */
    int largestRectangleArea(int[] heights){

        //给数组前后扩容两个数组：
        int[] newheighs=new int[heights.length+2];
        newheighs[0]=0;
        newheighs[heights.length+1]=0;

        for (int i=0;i< heights.length;i++){
            newheighs[i+1]=heights[i];
        }

        int result=0;
        //新建一个栈：
        Deque<Integer> stack = new LinkedList<>();
        stack.push(0);
        //遍历数组：
        for (int i=1;i<newheighs.length;i++){
            if (newheighs[i]>newheighs[stack.peek()]){
                stack.push(i);
            }else if(newheighs[i] == newheighs[stack.peek()]){
                //相等的情况：
                stack.poll();
                stack.push(i);
            }else{
                //求高度和宽度：
                while (!stack.isEmpty() && newheighs[i]< newheighs[stack.peek()]){
                    int mid=stack.peek();
                    stack.poll();
                    if (!stack.isEmpty()){
                        int h=newheighs[mid];
                        int w= i - stack.peek() -1;
                        result =Math.max(result,h * w);
                    }
                }
                stack.push(i);
            }
        }
        return result;
    }
}
