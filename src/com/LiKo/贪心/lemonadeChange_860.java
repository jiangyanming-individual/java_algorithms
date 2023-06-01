package com.LiKo.贪心;

import javax.swing.plaf.IconUIResource;
import java.util.HashMap;

/**
 * @author Lenovo
 * @date 2023/3/12
 * @time 9:42
 * @project java_算法
 **/
public class lemonadeChange_860 {

    //柠檬水找零钱：

    public boolean lemonadeChange(int[] bills){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0;i< bills.length;i++){
            if(bills[i] == 5){
                //遇到5的话直接加入；
                hashMap.put(5,hashMap.getOrDefault(5,0)+1);
                continue;
            }

            if(bills[i] == 10){
                if(hashMap.get(5) == 0){
                    return false;
                }
                //5--
                hashMap.put(5,hashMap.getOrDefault(5,0)-1);
                //10加加
                hashMap.put(10,hashMap.getOrDefault(10,0)+1);
            }
            if(bills[i] == 20){

                if(hashMap.get(5)>0 && hashMap.get(10)>0){
                    hashMap.put(5,hashMap.getOrDefault(5,0)-1);
                    hashMap.put(10,hashMap.getOrDefault(10,0)-1);

                }else if(hashMap.get(5)>=3){
                   hashMap.put(5,hashMap.getOrDefault(5,0)-3);
                }else {
                    return false;
                }
            }
        }
        return true;
    }

}
