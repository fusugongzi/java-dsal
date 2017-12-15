package com.cafintech.linertable;

/**
 * Created by 15600 on 2017/12/6.
 */
public class LinkedList<E> {
    Node<E> head=null;//链表头
    Node<E> tail=null;//链表尾

    //空链表创建新节点
    void createNewNode(E item){
        head=new Node<E>(item);//创建新的节点，并且让head指向此节点
        tail=head;             //tail也指向此节点
    }

    //链表追加节点
    void addNode(E item){
        tail.next=new Node<E>(item);//创建新节点，tail.next指向新节点
        tail=tail.next;             //tail位置改变
    }

    //顺序遍历链表
    void travelList(){
        Node<E>current=head;
        while (current!=null){
            System.out.println(current.item);
            current=current.next;
        }
    }

    //倒序遍历链表,主要运用递归的思想
    void printListRev(Node<E> head){
        if(head!=null){
            printListRev(head.next);
            System.out.println(head.item);
        }
    }

    //反转单链表
     Node<E> revList(Node<E> head){
        if(head==null){
            return null;
        }

        Node<E> current=head;

        while (current!=null){
            Node<E> nodeNext=current.next;
            if(nodeNext==null){
                return current;
            }
            nodeNext.next=current;
            current.next=nodeNext.next;
            current=nodeNext;
        }
        return null;
    }

}
