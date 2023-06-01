package com.twice_LiKo.贪心;

/**
 * @author Lenovo
 * @date 2023/4/8
 * @time 8:53
 * @project java_算法
 **/
public class jump_45 {

    public int jump(int[] nums){

        if (nums.length == 1) return 0;//在 0不需要跳；
        int count=0;
        int curdistance=0;
        int nextdistance=0;

        for (int i=0;i< nums.length;i++){

            //下一步最大覆盖范围；
            nextdistance=Math.max(nextdistance,i+nums[i]);

            if (i == curdistance){
                //如果index已经达到的了curdistance的下标，判断能不到达终点；

                if (curdistance< nums.length-1){
                    count++;//步数加1
                    curdistance=nextdistance;//将下一跳的最大覆盖范围赋给curdistance;
//                    if (nextdistance>= nums.length-1){
//                        break;
//                    }
                }else {
                    break;
                }
            }

        }
        return count;
    }

}
