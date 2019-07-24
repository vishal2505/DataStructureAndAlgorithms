package com.vish.examples.ds.linkedlist;

public class LinkedList {

    private Node head;

    public void insertAtHead(int data){
            Node newNode = new Node(data);
            newNode.setNextNode(this.head);
            this.head = newNode;
    }

    public int size(){
        int count = 0;
        Node current = this.head;
        while(current != null){
            count ++;
            current = current.getNextNode();
        }
        return count;
    }

    public void deleteAtHead(){
        this.head = this.head.getNextNode();
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public String toString() {
        String result = "{";

        Node current = this.head;
        while(current != null){
            result += current.toString() + ",";
            current = current.getNextNode();
        }
        result += "}";

        return result;

    }


}
