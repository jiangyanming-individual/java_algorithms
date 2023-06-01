package com.twice_LiKo.贪心;

/**
 * @author Lenovo
 * @date 2023/4/11
 * @time 8:15
 * @project java_算法
 **/
public class lemonadeChange_860 {

    public boolean lemonadeChange(int[] bills){
        int five=0,ten=0;
       //遇到5元直接加
        for (int bill: bills) {
            if (bill == 5){
                five++;
            }
            //遇到10 元 ，先判断5的还有没有，没有返回false 有的话10元加1，五元减1；
            if (bill == 10){
                if (five<=0) {
                    return false;
                }
                ten++;
                five--;
            }
            //遇到20 ，先判断10元和5元有没有，没有的话返回false； 有的话10元减1，5元减1；
            // 其次看有没有三张5元的；
            if (bill == 20){
                if (ten >0 && five >0){
                    ten--;
                    five--;
                }else if (five>=3){
                    five-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
