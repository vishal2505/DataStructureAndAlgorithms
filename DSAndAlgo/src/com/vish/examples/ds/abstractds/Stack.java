package com.vish.examples.ds.abstractds;

import java.util.Arrays;

public class Stack {

    private int[] items = new int[10];
    int top = -1;

    public boolean isEmpty(){
        return top < 0;
    }

    public void push(int data){
        if (top == items.length - 1)
            throw new RuntimeException("Stack is Full");
        items[++top] = data;
    }

    public int pop(){
        if (isEmpty())
            throw new RuntimeException("Stack is empty");
        return items[top--];
    }

    public int peek(){
        if (isEmpty())
            throw new RuntimeException("Stack is empty");
        return items[top];

    }

    @Override
    public String toString() {
        return "Stack{" +
                "items=" + Arrays.toString(items) +
                '}';
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st.isEmpty());
        st.push(10);
        st.push(05);
        st.push(2);
        st.push(3);
        st.push(13);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.pop());
        System.out.println(st);
    }
}
