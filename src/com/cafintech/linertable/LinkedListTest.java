package com.cafintech.linertable;

/**
 * Created by 15600 on 2017/12/6.
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.createNewNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.printListRev(linkedList.head);
        Node<Integer> head=linkedList.revList(linkedList.head);
        System.out.println(head);
        linkedList.printListRev(head);
    }
}
