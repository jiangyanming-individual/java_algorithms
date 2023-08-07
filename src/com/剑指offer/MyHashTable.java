package com.剑指offer;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Objects;

/**
 *
 * 定义hash表
 **/
public class MyHashTable {

    private Node[] table;

    private double loadFactor;
    private int size;
    private int availabelBucket;


    private static final double default_load_factor=0.75;
    private static final int default_capacity=16;
    private static final int linkToTreeCount=8;


    //有参构造器：
    public MyHashTable(int capacity ,double loadFactor){
        this.loadFactor=loadFactor;
        table=new Node[capacity];
        size=0;
        availabelBucket=0;
    }
    //无参构造：
    public MyHashTable(){
        this(default_capacity,default_load_factor);
    }


    //返回hash code
    private int hash(String key){

        return Objects.hash(key);
    }


    //遍历每一个节点；输出每一个节点的值：
    public void output(){
        for (int i = 0; i < table.length; i++) {
            Node p =table[i];

            System.out.println("第"+ i + "桶");
            while (p!=null){
                System.out.printf("%s\t",p.toString());
                p=p.getNext();
            }
            System.out.println();
        }
    }

    public Node getNode(String key){
        int hashVlue=hash(key);
        //计算 index；
        int idx=(table.length-1)&hashVlue;

        Node p=table[idx];
        //直到找到一个不冲突的地址：
        while (p!=null && !p.getKey().equals(key)){
            p=p.getNext();
        }
        return p;
    }

    public boolean putNode(String key,String value){

        int hashValue=hash(key);
        int idx=(table.length-1) & hashValue;
        Node head=table[idx];

        if (head ==null){
            //如果是第一次插入
            table[idx]=new Node(key,value,hashValue,null);
            size++;
            availabelBucket++;
        }else{
            //插入链表：
            Node p= head;
            Node temp=new Node(key,value,hashValue,null);

            //新定义的一个头指针：
            Node tail=null;
            int linkLen=0;

            while (p!=null){
                //如果插入的是相同的节点，就进行替换；
                if (p.equals(temp)){
                    p.setValue(value);
                    return false;
                }
                tail=p;
                p=p.getNext();
                linkLen++;
            }

            if (p == null){
                tail.setNext(temp);
                linkLen++;
            }

            if (linkLen>linkToTreeCount){
                //如果链表节点超过8个，需要转为红黑树；
            }


        }
        if (availabelBucket>=(int)table.length *loadFactor){
            //扩容；
            //resize
        }

        return true;
    }

}
