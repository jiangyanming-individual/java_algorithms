package com.剑指offer;

import java.util.Objects;

/**
 * @author Lenovo
 * @date 2023/8/7
 * @time 15:51
 * @project 定义hash节点
 **/
public class Node {

    private String key;
    private String value;
    private int hash;
    private Node next;

    public Node(String key,String value,int hash,Node next){
        this.key=key;
        this.value=value;
        this.hash=hash;
        this.next=next;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(key, node.key);
    }


    //hashCode函数：
    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

    @Override
    public String toString() {
        return "Node{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                ", hash=" + hash +
                ", next=" + next +
                '}';
    }
}
