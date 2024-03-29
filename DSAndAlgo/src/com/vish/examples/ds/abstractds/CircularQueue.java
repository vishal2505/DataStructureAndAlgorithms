package com.vish.examples.ds.abstractds;

import java.util.Arrays;

public class CircularQueue {
    private int[] items = new int[5];
    private int head = -1;
    private int tail = -1;
    private int numOfItems = 0; // this field makes the implementation easy, but we can implement even without it.

    public CircularQueue() {}

    public CircularQueue(int size) {
        this.items = new int[size];
    }

    public void enqueue(int item) {
        if (isFull())
            throw new RuntimeException("Queue is full");
        if (tail == items.length-1) // deal with circular case
            tail = -1;
        items[++tail] = item;
//		if (head == -1) head++;
        numOfItems++; // add 1 to the item count
    }

    public int dequeue() {
        if (isEmpty())
            throw new RuntimeException("Queue is empty");
        if (head == items.length-1)
            head = -1;
        numOfItems--;
        return items[++head];
    }

    public int peek() {
        return items[head+1];
    }

    public boolean isFull() {
        return numOfItems == items.length;
    }

    public boolean isEmpty() {
        return numOfItems == 0;
    }

    @Override
    public String toString() {
        return "CircularQueue{" +
                "items=" + Arrays.toString(items) +
                '}';
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();
        System.out.println(q.isEmpty());
        q.enqueue(5);
        q.enqueue(4);
        q.enqueue(6);
        q.enqueue(10);
        q.enqueue(46);
        System.out.println("1 : " + q);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println("2 : " + q);
        q.enqueue(2);
        q.enqueue(4);
        q.enqueue(6);
        q.enqueue(8);
        q.enqueue(10);
        System.out.println("3 : " + q);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println("4 : " + q);
        q.enqueue(11);
        q.enqueue(12);
        q.enqueue(13);
        System.out.println("5 : " + q);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println("6 : " + q);
    }
}
