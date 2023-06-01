package com.LiKo.test;


public class ArrayList02 implements List02<Number> {

    int[] res=new int[10];
    int size=0;
    int [] newres=new int[(int)(size*1.5)];

    @Override
    public void add(int data) {

        if(size >res.length){
            //如果大于res数组长度，扩容1.5倍
            for (int i=0;i<newres.length;i++){
                newres[i]=res[i];
            }
            newres[size++]=data;
        }
        res[size++]=data;
    }

    @Override
    public void add(int index, int data) {
        if(size+1<=res.length){
            for (int i=size-1;i>index;i--){
                res[i+1]=res[i];//从后往前进行覆盖操作；
            }
            res[index]=data;
            size++;
        }else{
            for (int i=0;i<newres.length;i++){
                newres[i]=res[i];
            }
            for (int i=size-1;i>index;i--){
                newres[i+1]=newres[i];
            }
            newres[index]=1;
            size++;
        }
    }

    @Override
    public int remove(int index) {

        if(index >=size || index <0){//不符合要求的index，直接返回-1；
            return -1;
        }
        if (size<=res.length){
            for (int i=index;i<size;i++){
                res[i]=res[i+1];//后一个元素覆盖前一个元素；
                return res[index];
            }
            size--;
        }else{
            for (int i=index;i<size;i++){
                newres[i]=newres[i+1];
                return newres[index];
            }
            size--;
        }
        return -1;
    }

    @Override
    public boolean removes(int data) {
        boolean flag=false;//用一个记号标记，删除成功为true；

        if(size < res.length){
            for (int i=0;i<size;i++){

                if(res[i]==data){
                    for (int j=i;j<size;j++){
                        res[j]=res[j+1];
                    }
                    size--;
                    i--;//数组长度要变化；
                    flag=true;
                }
            }
        }else{
            for (int i=0;i<size;i++){

                if(newres[i]==data){

                    for (int j=i;j<size;j++){
                        newres[j]=newres[j+1];
                    }
                    size--;//数组减一
                }

            }
        }
        return flag;
    }

    @Override
    public int get(int index) {

        if(index >=size || index < 0)
            return -1;
        if (size<=res.length){
            return res[index];
        }else{
            return newres[index];
        }

    }

    @Override
    public int size() {
        return size;
    }
}
