package com.LiKo.vector;

/**
 * @author Lenovo
 * @date 2023/2/2
 * @time 10:32
 * @project java_算法
 **/
public class merge_vector {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int size= nums1.length;//先保存nums1的大小
        int[] res=new int[size]; //
        int k=0;
        int i=0,j=0; //双指针，都分别指向nums的头
        for(i=0,j=0;i<size;){
            if(nums1[i]< nums2[j] && nums1[i]!=0){
                res[k++]=nums1[i];
                i++;
            }else {
                res[k++]=nums2[j];
                j++;
            }
        }
    }

}
