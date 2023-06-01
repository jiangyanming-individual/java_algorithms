package com.LiKo;

/**
 * @author Lenovo
 * @date 2022/11/1
 * @time 9:06
 * @project java_workspace
 **/
public class demo01 {

    class Solution {
        public int mySqrt(int x) {
            int low = 0, high = x, res = -1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if ((long) mid * mid <= x) {
                    res = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return res;
        }
    }


}
