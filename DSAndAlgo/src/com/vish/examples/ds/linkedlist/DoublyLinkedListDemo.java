package com.vish.examples.ds.linkedlist;

public class DoublyLinkedListDemo {
    public static  void main(String args[]) {

        DoublyLinkedList integers = new DoublyLinkedList();

        integers.insertAthead(5);
        integers.insertAthead(10);
        integers.insertAthead(2);
        integers.insertAthead(12);
        integers.insertAthead(19);
        integers.insertAthead(20);

        System.out.println(integers);
        System.out.println("Length of the list: "+ integers.size());

    }
}
