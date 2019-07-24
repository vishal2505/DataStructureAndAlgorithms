package com.vish.examples.ds.linkedlist;

public class LinkedListDemo {
    public static  void main(String args[]){

        LinkedList list = new LinkedList();
        list.insertAtHead(12);
        list.insertAtHead(05);
        list.insertAtHead(17);
        list.insertAtHead(34);
        list.insertAtHead(53);
        list.insertAtHead(21);

        System.out.println(list.toString());
        System.out.println("Size of the list:" +list.size());

       list.deleteAtHead();
        System.out.println(list);
        System.out.println("Size of the list:" +list.size());

    }
}
