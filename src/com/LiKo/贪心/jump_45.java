package com.LiKo.贪心;

/**
 * @author Lenovo
 * @date 2023/3/9
 * @time 22:14
 * @project java_算法
 **/
public class jump_45 {


    public int jump(int[] nums){
        if (nums.length == 1){
            return 0;
        }

        int count=0;//记录步数
        int curIndex=0;
        int nextIndex=0;//下一跳的index
        for (int i=0;i< nums.length;i++){

            nextIndex=Math.max(i+nums[i],nextIndex);
            //如果inde已经走到curIndex了，就判断是不是可以覆盖末尾的
            if (i == curIndex) {

                if (curIndex < nums.length - 1) {
                    //如果不能覆盖到末尾的范围，就count++；
                    count += 1;
                    curIndex = nextIndex;//更新下一条的位置；
                    if (nextIndex >= nums.length - 1) {
                        //如果说下跳的能覆盖范围的话，就直接break退出循环；
                        break;
                    }
                } else {
                    //当前已经到达末尾的位置：
                    break;
                }
            }
        }
        return count;
    }
}
