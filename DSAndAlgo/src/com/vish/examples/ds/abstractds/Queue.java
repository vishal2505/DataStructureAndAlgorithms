package com.vish.examples.ds.abstractds;

import java.util.Arrays;

public class Queue {

    private int[] items = new int[10];
    private int head = -1, tail = -1;

    public boolean isEmpty() {
        return (head < 0 && tail < 0);
    }

    public void inqueue(int data) {
        if (tail == items.length - 1)
            throw new RuntimeException("Queue is Full");
        items[++tail] = data;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is Empty");
        }
        return items[++head];
    }

    @Override
    public String toString() {
        return "Queue{" +
                "items=" + Arrays.toString(items) +
                '}';
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println(queue.isEmpty());
        queue.inqueue(5);
        queue.inqueue(10);
        queue.inqueue(26);
        queue.inqueue(31);
        queue.inqueue(2);
        System.out.println(queue.toString());
        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.toString());

    }
}
