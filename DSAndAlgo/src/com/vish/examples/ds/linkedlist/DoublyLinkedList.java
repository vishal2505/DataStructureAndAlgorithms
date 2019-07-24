package com.vish.examples.ds.linkedlist;

public class DoublyLinkedList {

    private DoublyLinkedNode head;

    public void insertAthead(int data){
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);
        newNode.setNextNode(this.head);
        if (this.head != null){
            this.head.setPrevNode(this.head);
        }
        this.head = newNode;
    }

    public int size(){
        if (head == null){
            return 0;
        }
        int len = 0;
        DoublyLinkedNode current = this.head;

        while (current != null){
            len ++;
            current = current.getNextNode();
        }
        return len;
    }

    @Override
    public String toString(){
        String result = "{";
        DoublyLinkedNode current = this.head;
        while (current != null){
            result += current + ", ";
            current = current.getNextNode();
        }

        return result + "}";
    }
}
