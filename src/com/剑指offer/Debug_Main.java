package com.剑指offer;

/**
 * @author Lenovo
 * @date 2023/8/7
 * @time 16:50
 * @project java_算法
 **/
public class Debug_Main {
    public static void main(String[] args) {
        MyHashTable myHashTable = new MyHashTable();

        myHashTable.putNode("123","1234");
        myHashTable.putNode("12345","12343432");
        myHashTable.putNode("abc","defg");
        myHashTable.putNode("123adas","1234");
        myHashTable.putNode("1","1234");
        myHashTable.putNode("123","1645");
        myHashTable.putNode("123","432");
        myHashTable.putNode("123","123");
        System.out.println("get(123):="+myHashTable.getNode("123"));

    }
}
