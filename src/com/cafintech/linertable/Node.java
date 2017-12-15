package com.cafintech.linertable;

/**
 * Created by 15600 on 2017/12/6.
 * 链表节点,包括两部分，存储元素以及指向下一节点的next
 */
public class Node<E> {
    E item;
    Node<E> next;


    //constructor
    Node(E item){
        this.item=item;
        this.next=null;
    }
}
